//By excluding 5 remaining sum need to find
package com.kn.arraymatrix;

public class MatrixSum_excludingMiddleOne {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i==0 || i==2 || (i==1 && j==0) || (i==1 && j==2)) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("Sum = "+ sum);
	}

}
