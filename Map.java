//Write a program to demonstrate the uses of Map
package assignment.phase;
import java.util.*;
public class Map {
	private static final String Entry = null;

	public static void main(String args[]){  
		HashMap<Integer, String> map=new HashMap<Integer,String>();          
		      map.put(100,"Amit");    
		      map.put(101,"Vijay");    
		      map.put(102,"Rahul");   
		      Object mapp;
			       
		      map.entrySet()  
		        
		      .stream()  
		       
		      .sorted(HashMap.Entry.comparingByKey())  
		     // .sorted(HashMap.Entry.comparingByKey(Comparator.reverseOrder()))  
		     // .sorted(HashMap.Entry.comparingByValue())  
		       
		      .forEach(System.out::println);  
		 }  
		}  


