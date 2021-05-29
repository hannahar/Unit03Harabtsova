package by.epam.unit03.main;

public class Task05 {
	public static void main(String[] args) {
		double x = 0.0;
		double fx = 0.0;
		double a, b, h;
		a = 0;
		b = 5;
		h = 1;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "fx");
		System.out.println("---------------------------------");
		for (x = a; x <= b; x += h) {
			fx = 2 * Math.tan(x / 2) + 1;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, fx);
		}
		System.out.println("---------------------------------");
	}

}
