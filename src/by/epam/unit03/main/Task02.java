package by.epam.unit03.main;

public class Task02 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		while (i >= 1 && i <= 99) {
			sum = sum + i;
			i = i + 2;

		}

		System.out.println(sum);

	}
}
