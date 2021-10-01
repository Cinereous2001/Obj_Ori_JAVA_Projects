import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Project2Driver {

	public static Account[] readAccountsFromFile(String fileName)
	{
		Scanner fileReader = null;
		Account[] acc = new Account[10];
		try {
			File inFile = new File(fileName);
			fileReader = new Scanner(inFile);
			int count = 0;
			while (fileReader.hasNextLine())
			{
				String line = fileReader.nextLine();
				String[] parts = line.split(", ");
				String[] smallerParts = parts[3].split(" ");
				Address address = new Address(Integer.parseInt(smallerParts[0]), smallerParts[1], parts[4], parts[5], parts[6]);
				Customer customer = new Customer(parts[2], address, parts[7]);
				acc[count] = new Account(customer, Double.parseDouble(parts[8]));
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (Exception f) {
				f.printStackTrace();
			}
		}
		return acc;
	}
	
	public static boolean writeAccountsToFile(Account[] accounts, String fileName) {
		PrintWriter pw = null;
		try {
		pw = new PrintWriter(fileName);
		for (int i = 0; i < accounts.length; i++)
		{
			pw.println(accounts[i].toString());
		}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				pw.close();
			} catch (Exception f) {
				f.printStackTrace();
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		accounts = readAccountsFromFile("C:/Users/parve/OneDrive/Desktop/MU Fall 2021/CSE 271/Project2/src/accounts.txt");
		writeAccountsToFile(accounts, "C:/Users/parve/OneDrive/Desktop/MU Fall 2021/CSE 271/Project2/src/output.txt");
		System.out.println("Done");
	}

}
