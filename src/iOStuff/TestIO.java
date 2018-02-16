package iOStuff;

import java.util.Scanner;
import java.io.*;

public class TestIO {
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Please input datafile name here.");
		Scanner input = new Scanner(System.in);
		String file = input.nextLine();
		File fileName = new File(file);
		Scanner input2 = new Scanner(fileName);
		int sum = 0;
		while (input2.hasNext())
		{
		sum += input2.nextInt();
		}
		System.out.println("Sum= " + sum);
	}
}
