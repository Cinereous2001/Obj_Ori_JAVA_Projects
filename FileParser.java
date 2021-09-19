/************************************************
  Author:     Mahir Rahman
  Class:      CSE271
  Date:       9/19/2021
  Assignment: Project 1
  Compiler:   Eclipse
************************************************/
/**
  Description:
  The program takes in a text file as input, and then performs one of three
  operations: raw word list, palindromes, and $100 words.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class FileParser {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner keyboard = null; //This is because we do not know whether initialization happens or not
		System.out.println("Enter input filename: ");
		String inputFileName = in.next();
		try {
			File inputFile = new File(inputFileName);
		    keyboard = new Scanner(inputFile);
		    
		    //This prints the options available for user to choose
		    System.out.println("Found. What do you want to output?");
		    System.out.println("1. Raw word list");
		    System.out.println("2. Palindromes");
		    System.out.println("3. $100 words");
		    System.out.println("Choose: ");
		    int choice = in.nextInt();
		    
		    System.out.println("Enter output filename: ");
		    String outputFileName = in.next();
		    File outputFile = new File(outputFileName); //Creates an output file
		    if (choice == 1)
		    {
		    	parse(inputFile, outputFile);
		    	System.out.println("Finished printing raw word list.");
		    	
		    }
		    else if (choice == 2)
		    {
		    	parsePalindrome(inputFile, outputFile);
		    	System.out.println("Finished printing palindromes.");
		    }
		    else if (choice == 3)
		    {
		    	parseHundredDollarWord(inputFile, outputFile);
		    	System.out.println("Finished printing $100 words.");
		    }
		    /*The following lines are the standard try, catch, and finally 
		      statements used to catch exceptions*/
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist. Goodbye.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} finally {
			try {
				keyboard.close();
				in.close();
			} catch (Exception f) {
				f.printStackTrace();
				return;
			}
		}
	}

		
		/**
		 * The method parses input from the file and stores the words in an output file
		 * @param in is the input file
		 * @param out is the output file
		 */
		public static void parse(File in, File out)
		{
			Scanner keyboard = null;
			PrintWriter pw = null;
			
			try {
				keyboard = new Scanner(in);
				pw = new PrintWriter(out);
				while (keyboard.hasNext())
				{
					String word = keyboard.next();
					pw.println(word);
				}
				/*The following lines are the standard try, catch, and finally 
			      statements used to catch exceptions*/
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist. Goodbye.");
				return;
			} catch (IOException e) {
				e.printStackTrace();
				return;			
			} catch (Exception e) {
				e.printStackTrace();
				return;
			} finally {
				try {
					keyboard.close();
					pw.close();
				} catch (Exception f) {
					f.printStackTrace();
					return;
				}
			}
		}
		
		/**
		 * The method returns a string in all capital letters with no spaces and punctuation marks.
		 * @param word is the input we receive
		 * @return a string with all capital letters with no spaces and punctuation marks
		 */
		public static String clean(String word)
		{
			Scanner in = new Scanner(word);
			in.useDelimiter("[^A-Za-z]+");
			String finalString = "";
			String str;
			while (in.hasNext())
			{
				str = in.next();
				str = str.trim();
				finalString = finalString + str;	
			}			
			return finalString.toUpperCase(); //The upperCase method helps convert the string to all upper case letters
		}
		
		/**
		 * The method determines whether the String is palindrome or not
		 * @param word
		 * @return a boolean that informs whether the word is palindrome or not
		 */
		public static boolean isPalindrome(String word)
		{
			word = clean(word);
			boolean status = true;
			if (word.length() == 1)
				return true;
			if (word.length() == 0)
				return false;
			for (int i = 0; i < word.length()/2; i++)
			{
				if (word.charAt(i) != word.charAt(word.length() - 1 - i))
					status = false;
			}
			return status;
		}
		
		/**
		 * Creates a file containing palindromes
		 * @param in
		 * @param out
		 */
		public static void parsePalindrome(File in, File out)
		{
			ArrayList <String> arr = new ArrayList<String>();
			Scanner keyboard = null;
			PrintWriter pw = null;
			
			try {
				boolean status = false;
				keyboard = new Scanner(in);
				pw = new PrintWriter(out);
				String word = "";
				while (keyboard.hasNext())
				{
					word = keyboard.next();
					
					status = isPalindrome(word);
					if (status == true)
					{
						word = clean(word);
						if (!arr.contains(word)) //This function checks the whole array for the desired word
						{
							arr.add(word);
						}
					}
				}
				
				Collections.sort(arr); //Sorts the array list in alphabetical order
				for (int i = 0; i < arr.size(); i++)
				{
					pw.println(arr.get(i));
				}
			/*The following lines are the standard try, catch, and finally 
			      statements used to catch exceptions*/	
			} catch (FileNotFoundException e) {
				System.err.println("****File Not Found Exiting Program****");
				e.printStackTrace();
				return;
			} catch (IOException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			finally {
				try {
					keyboard.close();
					pw.close();
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
			
		}
		
		/**
		 * Gives the value of the word assuming A is 1 and Z is 26
		 * @param word
		 * @return the value of the word
		 */
		public static int value(String word)
		{
			word = clean(word);
			Scanner str = new Scanner(word);
			int sum = 0;
			int value = 0;
			str.useDelimiter("");
			while (str.hasNext())
			{
				char ch = str.next().charAt(0);
				value = (int) ch;
				value = value - 64;
				sum = sum + value;
			}
			str.close();
			return sum;		
		}
		
		/**
		 * Creates a file containing the $100 words
		 * @param in
		 * @param out
		 */
		public static void parseHundredDollarWord(File in, File out)
		{
			Scanner parse = null;
			PrintWriter pw = null;	
			try {
				
				parse = new Scanner(in);
				pw = new PrintWriter(out);
				int value = 0;
				ArrayList <String> words = new ArrayList <String>();
				while (parse.hasNext())
				{
					String word = parse.next();
					value = value(word);
					word = clean(word);
					if (value == 100 && !words.contains(word))
					{
						words.add(word);
					}
				}
				
				Collections.sort(words);
				for (int i = 0; i < words.size(); i++)
					pw.println(words.get(i));
				
				
			/*The following lines are the standard try, catch, and finally 
			      statements used to catch exceptions*/	
			} catch (FileNotFoundException e) {
				System.err.println("****File Not Found Exiting Program****");
				e.printStackTrace();
				return;
			} catch (IOException e) {
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			finally {
				try {
					parse.close();
					pw.close();
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		} //end parseHundredDollarWord
}
