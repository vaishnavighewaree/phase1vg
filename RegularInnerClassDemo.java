package assignment.phase;

public class RegularInnerClassDemo {
public static void main(String[] args) {
		
		
		new Outer().new Inner().in();
	}

}

class Outer{
	private int val;
	class Inner{
		int val;
		void in() {
			int val = 90;
			System.out.println("Inside Inner's in...");
			System.out.println("Accessing local val : " + val);
			System.out.println("Accessing Inner's instance val : " + this.val);
			System.out.println("Accessing Outer's instance val : " + Outer.this.val);
		}
	}
	
	void met() {
		Inner ref = new Inner();
		ref.in();
	}
	
	
	
	
}




