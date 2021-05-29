package by.epam.unit03.main;

public class Task03 {
	public static void main(String[] args) {
		int i;
		int previousSum = 1;
		int currentSum;
		double multiplication = 1.0;
		for (i = 1; i <= 9; i++) {
			currentSum = previousSum + i + 1;
			multiplication = multiplication * currentSum;
			previousSum = currentSum;
		}
		System.out.println(multiplication);

	}

}
