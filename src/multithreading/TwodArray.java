package multithreading;


import java.util.Scanner;

public class TwodArray {
	
	public int[] sort(int[] arr,String op)
	{
		int len=arr.length;
		
		for (int i = 0; i < len ; i++) {
			for (int j = 0; j < len; j++) {
				if(op.equals('A'))
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
				if(op.equals('D')) {
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			
		}
		
		return arr;
		
		
	}
	
	
	public static void main(String[] args) {

		int row,col;
		
		
		Scanner sc=new Scanner(System.in);
        TwodArray two=new TwodArray();			
			
		
		System.out.println("enter rows");
		row=sc.nextInt();
		
		System.out.println("enter columns");
		col=sc.nextInt();
		
	       int arr[][] = new int[row][col];

		
		System.out.println("enter elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j]=sc.nextInt();
				
				
			}
			
		}
		
		System.out.println("after sorting array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("row"+(i+1));
			for (int j = 0; j < arr.length; j++) {
				System.out.println("col"+(j+1));
				arr[i][j]=sc.nextInt();
				
			}
			
			if(i%2==0) {
				arr[i]=two.sort(arr[i],"A");
			}
			else {
				arr[i]=two.sort(arr[i], "D");
				
			}
		}
		
		
		
			System.out.println("whole array is");
		for (int i = 0; i < arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++)
	           {
				 System.out.println(arr[i][j]+" ");
//				 System.out.println("\t");
				 System.out.println();
	           }
//	           System.out.println("\n");
	       }
		}
	
	
         
	

	
	
	
	
}
	


