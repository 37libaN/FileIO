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
		
		//Display ODD Numbers
		while (input2.hasNext())
		{
			if (input2.nextInt() % 2 == 1){
				System.out.println(input2.nextInt());
			}
		}
		
		//d
		Scanner input5 = new Scanner(fileName);
		int counter = 0;
		while(input5.hasNext()){
			counter++;
			if(counter%5 == 0){
				System.out.println(input5.nextInt());
			}
		}
	}
}
