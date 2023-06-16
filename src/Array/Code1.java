package Array;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[10];
		
		for(int i=0;i<arr.length;i++)	
		{
			System.out.print("element["+i+"]=");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The elements of array is["+i+"]="+arr[i]);
			
		}
		System.out.print("The evenn numbers are :");
		for(int i=0;i<arr.length;i++)	
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+",");
			}
		}

	}

}
