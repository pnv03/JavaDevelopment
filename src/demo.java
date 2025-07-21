// Define a Calculator class
class Calculator {
	// Method to add two numbers
	public int add(int num1, int num2) {
		return num1 + num2; // Return the sum of num1 and num2
	}
}

// Define the demo class with the main method
public class demo {
	public static void main(String[] args) {
		// Create an instance of the Calculator class
		Calculator calculator = new Calculator();

		// Define two numbers to add
		int num1 = 4;
		int num2 = 7;

		// Call the add method and store the result
		int result = calculator.add(num1, num2);

		// Print the result
		System.out.println("The sum is: " + result);
	}
}
