package multithreading;

import java.util.Scanner;

public class RowSortArr {
	

	public static void main(String[] args) {

	int rows,cols;
	int count,temp;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter number of rows in array");
	 rows=sc.nextInt();
	
	System.out.println("enter number of columns in array");
		cols=sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		
		//enter array elements
		System.out.println("enter elements in array");
		for (int i = 0; i < rows; i++) {
			 for (int j = 0; j < cols; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		//print array elements
		System.out.println("array is :\n");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println(arr[i][j] + " ");		
			}
			System.out.println();
		}
		
		
			
		
	}

}
