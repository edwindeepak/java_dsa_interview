package basics;

import java.util.Scanner;

public class Basics2_ControlFlow {
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // if-else example
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // switch example
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number");
        }

        // loops example
        System.out.println("Counting from 1 to 5 using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int count = 1;
        System.out.println("Counting from 1 to 5 using a while loop:");
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        scanner.close();
    }

}
