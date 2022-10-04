package array2d;

import java.util.Scanner;

public class RowwiseSum {

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
		for(int []i:arr)
		{
			int sum=0;
			for(int j:i)
			{
				sum+=j;
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
