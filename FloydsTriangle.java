package Knightingale;

import java.util.Scanner;

public class FloydsTriangle {
  public static void main(String[] args) {
	
	  int rows, number = 1, counter, j;
	  //To get the user's input
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the number of rows for flody's triangle:");
	  
	  //Copy user input into an integer variable named rows
	  rows = input.nextInt();
	  System.out.println("Flody's triangle");
	  System.out.println("*******************");
	  for (counter = 1 ; counter <= rows ; counter++)
	  {
		  for ( j = 1 ; j<= counter ; j++)
		  {
			  System.out.println(number+" ");
			  // Incrementing the number value
			  number++;
		  }
		  //for new line
		  System.out.println();
	  }
}
}
