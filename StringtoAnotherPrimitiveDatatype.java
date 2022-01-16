//Write a program which will take a string as input and will convert it into other primitive data types
package assignment.phase;

public class StringtoAnotherPrimitiveDatatype {
	
		public static void main(String args[])
		{
			
			byte b;

		
			int i = 257;
			double d = 323.142;

			
			System.out.println("Conversion of int to byte.");

			
			b = (byte)i;

			
			System.out.println("i = " + i + " b = " + b);
			System.out.println("\nConversion of double to byte.");

			
			b = (byte)d;

			
			System.out.println("d = " + d + " b= " + b);
		}
	}



