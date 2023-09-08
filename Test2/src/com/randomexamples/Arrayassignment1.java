package com.randomexamples;

public class Arrayassignment1 {
	public static void main(String[] args) {
		int c =0;
		 for(int i =1;i<=10;i++) {
			 c= c+1;
		 }
		 System.out.println(c);
	
		int arr[] = new int[c];
		int k =0;
		for(int j=1;j<=10;j++) {
			arr[k]=7*j;
			k=k+1;
		}
		for(int z=0;z<arr.length;z++) {
			System.out.println(arr[z]);
		}
	}

}
