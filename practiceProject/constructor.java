package assignment.phase;

public class constructor {
	public static void main(String[] args) {
		constructor obj = new constructor();
		System.out.println(obj);
		constructor obj1 = new constructor(4,5);

		}
		//No argument constructor
		constructor()
		{
			System.out.println("constructor()");
		}
		//Parametrised Constructor
		constructor(int a,int b)
		{
			System.out.println(a);
			System.out.println(b);
		}

}
