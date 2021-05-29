package by.epam.unit03.main;

public class Task04 {
	public static void main(String[] args) {
		{
			double x;
			double y = 0.0;

			for (x = 5.0; x > -5.0; x -= 0.5) {
				y = 5 - Math.pow(x, 2) / 2;
				System.out.println(y);
			}

		}
	}
}
