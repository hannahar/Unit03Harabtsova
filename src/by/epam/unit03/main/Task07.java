package by.epam.unit03.main;

public class Task07 {
	public static void main(String[] args) {

		char value;
		value = 'L';
		System.out.println(value);
		switch (value) {
		case 'I':
			System.out.println("value is equal to 1");
			break;
		case 'V':
			System.out.println("value is equal to 5");
			break;
		case 'X':
			System.out.println("value is equal to 10");
			break;
		case 'L':
			System.out.println("value is equal to 50");
			break;
		case 'C':
			System.out.println("Value is equal to 100");
			break;
		case 'D':
			System.out.println("value is equal to 500");
			break;
		case 'M':
			System.out.println("value is equal to 1000");
			break;
		default:
			System.out.println("You've entered incorrect number.");

		}
	}

}
