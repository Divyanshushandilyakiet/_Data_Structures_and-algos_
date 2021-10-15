//Remove an element form an array
package datastructure;

import java.util.Arrays;

public class Removeanelement {
	public static void main(String[] args) {
		   int[] myarray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	System.out.println("Original Array: "+Arrays.toString(myarray));
	 int reindex=4;
	 
	 for(int i=reindex;i<myarray.length-1;i++)
	 {
		 myarray[i]=myarray[i+1];
	 }
	 System.out.println("\nNew Array: "+Arrays.toString(myarray));
	
	}
}
