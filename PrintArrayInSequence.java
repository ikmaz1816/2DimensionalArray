package array2d;

import java.util.Scanner;

public class PrintArrayInSequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m-count;j++)
			{
				for(int k=0;k<m;k++)
				{
					System.out.print(arr[i][k]);
				}
				System.out.println();
			}
			count++;
		}
		sc.close();

	}

}
