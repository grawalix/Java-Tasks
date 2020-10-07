package multithreading;



import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class multidarr {

		
	public static int[] sortOnDemand(int[] arr, String ope) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (ope.equals("A")) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				if (ope.equals("D")) {
					if (arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}

				}
			}
		}
		return arr;
	}
	
	
	
	
	public static int[] sortArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] s) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row");
		int row = sc.nextInt();
		System.out.println("Enter Col");
		int col = sc.nextInt();

		int[] arr = new int[row * col];
		Stack<Integer> stk = new Stack<Integer>();
		int[][] arr2D = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Element " + (i + 1));
			arr[i] = sc.nextInt();
		}
		arr = sortArr(arr);
		for (int i = 0; i < arr.length; i++) {

			stk.push(arr[i]);
		}
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				arr2D[i][j] = stk.pop();
			}
			if(i%2==0) {
				arr2D[i]=sortOnDemand(arr2D[i], "A");
			}
			else {
				arr2D[i]=sortOnDemand(arr2D[i], "D");
			}

		}
		
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print("\t"+arr2D[i][j]);
			}
			System.out.println();
		}

	}

}
