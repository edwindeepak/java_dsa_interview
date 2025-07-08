package basics;

import java.util.Scanner;

public class Basics1 {
	
	 public static void main(String[] args) {
	        int age = 25;
	        double price = 19.99;
	        char grade = 'A';
	        boolean isJavaFun = true;

	        System.out.println("Age: " + age);
	        System.out.println("Price: $" + price);
	        System.out.println("Grade: " + grade);
	        System.out.println("Is Java fun? " + isJavaFun);

	        // Taking input from user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.println("Hello, " + name + "!");

	        scanner.close();
	    }

}
