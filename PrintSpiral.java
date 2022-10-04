package array2d;

import java.util.Scanner;

public class PrintSpiral {

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
		int rs=0;
		int re=arr.length-1;
		int cs=0;
		int ce=arr.length-1;
		while(rs<=re && cs<=ce)
		{
			for(int i=cs;i<=ce;i++)
			{
				System.out.print(arr[rs][i]+" ");
			}
			rs+=1;
			for(int i=rs;i<=re;i++)
			{
				System.out.print(arr[i][ce]+" ");
			}
			ce-=1;
			for(int i=ce;i>=cs;i--)
			{
				System.out.print(arr[re][i]+" ");
			}
			re-=1;
			for(int i=re;i>=rs;i--)
			{
				System.out.print(arr[i][cs]+ " ");
			}
			cs+=1;
		}
		sc.close();

	}

}
