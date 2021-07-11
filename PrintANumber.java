package Knightingale;

import java.util.Scanner;

public class PrintANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		// Creates a reader instance which takes 
		// input from standard input - keyword
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		// nextInt() reads the next integer from the keyword
		int number = reader.nextInt();
		
		// printIn() prints he following line to the output screen
		System.out.println("You entered: " + number);
	}

}
