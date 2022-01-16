//Write a program to demonstrate the uses of constructors and its types
package assignment.phase;

public class UsingConstructors {
	int val;

	public static void main(String[] args) {
			
		System.out.println(new UsingConstructors(80).val);
		
		UsingConstructors ref = new UsingConstructors(90);
		
		System.out.println(ref.val);

	}
	
	UsingConstructors(int val) {
		this.val = val;
	}
	

}


