//Write a program to create single-dimensional and multidimensional arrays.
package assignment.phase;

public class OneAndMultidimentionalArray {
	 public static void main(String[] args) {
		//1d 
		 int[] number;
	        
	       
	        number =  new int[10];
	        
	        // Initialization of Array
	        number[0] = 11;
	        number[1] = 22;
	        number[2] = 33;
	        number[3] = 44;
	        number[4] = 55;
	        number[5] = 66;
	        number[6] = 77;
	        number[7] = 88;
	        number[8] = 99;
	        number[9] = 100;
	        
	  
	        for(int i = 0; i < number.length; i++) {
	            System.out.println("one dimentional array:"+number[i]);
	        }
	        // create a 2d array
	        int[][] a = {
	            {1, -2, 3}, 
	            {-4, -5, 6, 9}, 
	            {7}, 
	        };
	      
	       
	        for (int[] innerArray: a) {
	            
	            for(int data: innerArray) {
	                System.out.println("two dimentional array"+data);
	            }
	        //3d
	        int[][][] test = {
	                {
	                  {1, -2, 3}, 
	                  {2, 3, 4}
	                }, 
	                { 
	                  {-4, -5, 6, 9}, 
	                  {1}, 
	                  {2, 3}
	                } 
	            };

	            // for..each loop to iterate through elements of 3d array
	            for (int[][] array2D: test) {
	                for (int[] array1D: array2D) {
	                    for(int item: array1D) {
	                        System.out.println("three dimentional array"+item);
	                    }
	                }
	            }
	        }
	 }
}

