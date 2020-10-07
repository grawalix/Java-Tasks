package multithreading;

import java.util.Scanner;

public class Sorting {
	
	public int[] sort(int[] ar,String opr)
	{
		int le=ar.length;
		
		for (int i = 0; i < le; i++) {
			for (int j = 0; j < le; j++) {
				
				if (opr.equals("D")) {
					if (ar[i]>ar[j]) {
						int var=ar[i];
						ar[i]=ar[j];
						ar[j]=var;
					}
				}
				
				if (opr.equals("A")) {
					if (ar[i]< ar[j]) {
						int var=ar[i];
						ar[i]=ar[j];
						ar[j]=var;
			}
			
		}
	}
		}
		return ar;
	}

	public static void main(String[] args) {
		
		
		int row,colo;
		Scanner s=new Scanner(System.in);
		Sorting sor =new Sorting();
		
		System.out.println("enter rows of matrix");
		row=s.nextInt();
		
		System.out.println("enter columns of matrix");
		colo=s.nextInt();
		
		//entering elements in array
		int[][] ar=new int[row][colo];
		System.out.print("Enter " + row*colo + " Elements to Store in matrix :\n");
		for (int i = 0; i < ar.length; i++) {
//			System.out.println("Rows"+(i+1));
			
			for (int j = 0; j < ar[i].length; j++) {
//				System.out.println("Columns"+(j+1));
				System.out.println("Enter Matrix["+i+"]["+j+"] Element");
				ar[i][j]=s.nextInt();
			}
			if (i%2==0) {
				ar[i]=sor.sort(ar[i], "A");	
			}
			else {
				ar[i]=sor.sort(ar[i], "D");
			}
		}
		
		//printing the array
		System.out.println("The  Matrix is");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}

