//Sum of Upper and Lower triangle
package com.kn.arraymatrix;

public class MatrixTriangle_Sum {
	public static void main(String[] args) {
		
	int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
	
	int sum = 0, sum1 = 0;
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a.length; j++) {
			//Upper triangle sum
			if(i<j) {
				sum += a[i][j];
			}
			//Lower triangle sum
			if(i>j) {
				sum1 += a[i][j];
			}
			//System.out.print(a[i][j] + " ");
		}
		//System.out.println();
	}
	
	
	System.out.println("Upper traingle sum : "+ sum);
	System.out.println("Lower traingle sum : "+ sum1);
}
}