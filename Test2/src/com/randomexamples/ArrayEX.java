package com.randomexamples;

public class ArrayEX {
   public static void main(String args[]) {
	   int count =0;
	   for(int i=20;i>=10;i--) {
		   count =count +1;
	   }
	   System.out.println(count);
	   int arr[]  = new int [count];
	   int k=0;
	   for(int j=20;j>=10;j--) {
		   arr[k]=j*j*j;
		   k++;
	   }
	   
	  for(int z=arr.length-1;z>=0;z--) {
		  System.out.println(arr[z]);
	  }
   }
}