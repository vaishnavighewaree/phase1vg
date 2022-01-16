//Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder
package assignment.phase;

public class BuilderAndBuffer {
	
		public static void concat1(String s1)
		{
			s1 = s1 + "forjava";
		}

		
		public static void concat2(StringBuilder s2)
		{
			s2.append("forjava");
		}

		
		public static void concat3(StringBuffer s3)
		{
			s3.append("forjava");
		}

		
		public static void main(String[] args)
		{
			
			String s1 = "training";

			
			concat1(s1);

			
			System.out.println("String: " + s1);

			
			StringBuilder s2 = new StringBuilder("training");

			
			concat2(s2);

		
			System.out.println("StringBuilder: " + s2);

			
			StringBuffer s3 = new StringBuffer("training");

			
			concat3(s3);

			
			System.out.println("StringBuffer: " + s3);
		}
	}



