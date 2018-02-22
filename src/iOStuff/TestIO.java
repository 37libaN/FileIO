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
		System.out.println("Sum");
		System.out.println("Sum= " + sum);
		input2.close();
		System.out.println();
		
		//a
		input2 = new Scanner(fileName);
		System.out.println("Print all");
		while (input2.hasNext())
		{
			System.out.println(input2.nextLine());
		}
		input2.close();
		System.out.println();
		
		//b
		input2 = new Scanner(fileName);
		int number =0;
		System.out.println("Evens");
		while(input2.hasNext())
		{
			number = input2.nextInt();
			if (number % 2 == 0){
				System.out.println(number);
			}
		}
		input2.close();
		System.out.println();
		
		//c
		int odd = 0;
		input2 = new Scanner(fileName);
		System.out.println("Odds");
		while (input2.hasNext())
		{
			odd=input2.nextInt();
			if (odd % 2 == 1){
				System.out.println(odd);
			}
		}
		input2.close();
		System.out.println();
		
		//d
		input2 = new Scanner(fileName);
		int counter = 0;
		System.out.println("Every fifth");
		while(input2.hasNext()){
			counter++;
			int temp = input2.nextInt();
			if(counter%5 == 0){
				System.out.println(temp);
			}
		}
		input2.close();
		System.out.println();
		
		//e
		input2 = new Scanner(fileName);
		System.out.println("Mults of 3");
		while (input2.hasNext())
		{
			int next = input2.nextInt();
		if(next%3==0){
			System.out.println(next);
		}
		}
	}
}
