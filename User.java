//Write a program to search a string entered by a user from the array of strings
package assignment.phase;

import java.util.Scanner;

public class User {


	public static void main(String[]args) {
		int no;
		Scanner input=new Scanner(System.in);
		System.out.println("how many friends u have?");
		no = input.nextInt();
		String []names=new String[no];
		for(int counter=0;counter<no;counter++) {
			System.out.println("eneter name of friend"+(counter+1));
			names [counter]=input.next();
		}
		input.close();
		System.out.println("your friends are:");
		for(int counter = 0;counter<no;counter++)
		{
			System.out.println(names[counter]);
		}
	}

	}

