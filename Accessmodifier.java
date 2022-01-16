//Write a program to demonstrate how and when access modifiers are used.
package assignment.phase;

public class Accessmodifier {
	public int flag; 

	public static void main(String[] args) { 
		

	}
	
	protected void func() {
		
	}
	
	void met() {
		
	}
	
	private void doSomething() {
		
	}

}

class Other{
		void func() {
		
			Accessmodifier ref = new Accessmodifier();
			
			ref.flag = 78;
			
			ref.met();
			
			ref.func();
			
//
		}
}

