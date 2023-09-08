package com.randomexamples;

public class ArrayExample2 {

	public static void main(String[] args) {
		int c = 0;
		for(int i=20;i<=40;i++) {

			if(i%2==0) {
				c= c+1;
			}

		}
		System.out.println(c);
		int arr[] = new int[c];
		int k = 0;
		for(int j=20;j<=40;j++) {
			if(j%2==0) {
				arr[k]=j;
				k=k+1;
			}

		}
		for(int z =arr.length-1;z>=0;z--) {
			System.out.println(arr[z]);

		}

	}
}
