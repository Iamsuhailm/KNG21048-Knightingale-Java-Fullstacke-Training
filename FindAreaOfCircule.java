package Knightingale;

import java.util.Scanner;

public class FindAreaOfCircule {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Ener the radius: ");
	//We are storing the entered radius in double 
	//because a user can enter radius in decimals
	
	double radius = scanner.nextDouble();
	//Area = PI* (radius*radius)
	double area = Math.PI * (radius * radius);
	System.out.println("The area of circle is: " +area);
	//Circumference= 2*PI * 2 * radius
	double circumference = Math.PI * 2 * radius;
	System.out.println("The circumference of the circle is :" +circumference);
			
	
	}
}
