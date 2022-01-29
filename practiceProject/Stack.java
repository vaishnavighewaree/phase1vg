package asg;

public class Stack {
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX];  
	boolean isEmpty() 
	{ 
    		return (top < 0); 
	} 
	Stack() 
	{ 
    		top = -1; 
	} 
	boolean push(int x) 
	{ 
    		if (top >= (MAX-2))
    		{ 
        			System.out.println("Stack Overflow"); 
        			return false; 
    		} 
    		else
    		{ 
        			a[++top] = x; 
        			System.out.println(x + " pushed into stack"); 
        			return true; 
    		} 
	} 
int pop() 
	{ 
    		if (top < 0) 
    		{ 
        			System.out.println("Stack Underflow"); 
        			return 0; 
    		} 
    		else
    		{ 
        			int x = a[top--]; 
        			return x; 
    		} 
	} 

	public static void main(String args[])
{
    		Stack s = new Stack(); 
    		s.push(30); 
    		s.push(50); 
    		s.push(20); 
    		System.out.println(s.pop() + " Popped from stack"); 
	}
} 	



