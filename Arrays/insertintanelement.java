// Inserting an element in an Array
package datastructure;

import java.util.Arrays; 
public class insertintanelement {
 
public static void main(String[] args) {
	int myarr[]= {12,324,23,45,23,35,23};
	
	int inposi=3;
	int newvalue=56;
	System.out.println("Original Array: "+Arrays.toString(myarr));
	
	for(int i=myarr.length-1;i>inposi;i--) {
		myarr[i]=myarr[i-1];
	}
	myarr[inposi]=newvalue;
	System.out.println("New Array: "+Arrays.toString(myarr));	
}
 }
