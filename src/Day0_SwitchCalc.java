import java.util.Scanner;

public class Day0_SwitchCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		float num1 = sc.nextInt();

		System.out.println("Enter Second Number: ");
		float num2 = sc.nextInt();

		System.out.println("Enter  an Operator (+, -, *, /, %): ");
		char operator = sc.next().charAt(0);

		switch (operator) {
			case '+':
				System.out.println("Result: " + (num1 + num2));
				break;
			case '-':
				System.out.println("Result: " + (num1 - num2));
				break;
			case '*':
				System.out.println("Result: " + (num1 * num2));
				break;
			case '/':
				System.out.println("Result: " + (num1 / num2));
				break;
			case '%':
				System.out.println("Result: " + (num1 % num2));
				break;
			default:
				System.out.println("Enter Valid Operation!");
		}
	}
}
