package array2d;

import java.util.Scanner;

public class LargestRowAndCol {

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
		int largest_row=-1;
		int largest_col=-1;
		int max_row=0;
		int max_col=0;
		int count=0;
		for(int[] i:arr)
		{
			int sum=0;
			for(int j:i)
			{
				sum+=j;
			}
			if(sum>max_row)
			{
				max_row=sum;
				largest_row=count;
			}
			count++;
		}
		
		for(int i=0;i<m;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				sum+=arr[j][i];
			}
			if(sum>max_col)
			{
				max_col=sum;
				largest_col=i;
			}
		}
		
		if(max_row>max_col)
			System.out.println("row"+" "+max_row+" "+largest_row);
		else
			System.out.println("column"+" "+max_col+" "+largest_col);
		sc.close();

	}

}
