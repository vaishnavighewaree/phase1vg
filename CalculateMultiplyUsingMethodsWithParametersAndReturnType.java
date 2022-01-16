//Write a program to demonstrate different methods of different return types
package assignment.phase;
import java.util.Scanner;
public class CalculateMultiplyUsingMethodsWithParametersAndReturnType {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two numbers");

		int result = new CalculateMultiplyUsingMethodsWithParametersAndReturnType().multiply(scan.nextInt(),
				scan.nextInt());

		System.out.println("Multiplication : " + result);
	}

	int multiply(int firstNumber, int secondNumber) {

		return (firstNumber * secondNumber);
		


	}
}


