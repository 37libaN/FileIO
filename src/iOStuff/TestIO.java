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
		input2.close();
		
		//Display ODD Numbers
		while (input2.hasNext())
		{
			if (input2.nextInt() % 2 == 1){
				System.out.println(input2.nextInt());
			}
		}
		input2.close();
		
		//d
		input2 = new Scanner(fileName);
		int counter = 0;
		while(input2.hasNext()){
			counter++;
			int temp = input2.nextInt();
			if(counter%5 == 0){
				System.out.println(temp);
			}
		}
		
		//e
		Scanner input7 = new Scanner(fileName);
		while (input7.hasNext())
		{
			int next = input7.nextInt();
		if(next%3==0){
			System.out.println(next);
		}
		}
	}
}
