package by.epam.unit03.main;

public class Task06 {
	public static void main(String[] args) {

		int x = 6420;
		int y = 453607;

		while (x > 0) {
			int a = x % 10;

			int b = y % 10;

			int c = y;
			while (c > 0) {
				if (a == b) {
					System.out.println("a= " + a + " and b = " + b);
				}
				c /= 10;
				b = c % 10;

			}

			x /= 10;
		}
	}
}
