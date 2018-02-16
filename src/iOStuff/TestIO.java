package iOStuff;
import java.util.Scanner;
import java.io.*;
public class TestIO {
	public static void main(String[] args){
		System.out.println("Please input datafile name here.");
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		File file = new File(fileName);
	}
}
