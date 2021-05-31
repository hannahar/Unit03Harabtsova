package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			int x, y;
			Scanner value1;
			value1 = new Scanner(System.in);
			System.out.print("Enter value1 > ");
			x = value1.nextInt();
			Scanner value2;
			value2 = new Scanner(System.in);
			System.out.print("Enter vakue2 > ");
			y = value2.nextInt();
			String z;
			Scanner znak;
			znak = new Scanner(System.in);
			System.out.print("Specify operation > ");
			z = znak.nextLine();
			int a;

			switch (z) {

			case "+":
				a = x + y;
				System.out.println(a);
				break;
			case "-":
				a = x - y;
				System.out.println(a);
				break;
			case "*":
				a = x * y;
				System.out.println(a);
				break;
			case "/":
				if (y == 0) {
					System.out.println("Y cannot be equal to 0");
				} else {
					a = x / y;
					System.out.println(a);
				}
				break;
			case "#":
				flag = false;
				break;
			default:
				System.out.println("You have entered incorrect znak.");

			}
		}

	}// Молодец - зачтено
}
