package array2d;

import java.util.Scanner;

public class TotalSumOnBoundariesAndDiagonal {

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
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==0 || i==arr.length-1 || j==0 || j==arr.length-1)
					sum+=arr[i][j];
				else if(i==j)
					sum+=arr[i][j];
				else if(arr.length-1-i==j)
					sum+=arr[i][j];
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
