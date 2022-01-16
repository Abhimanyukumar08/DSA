import java.util.*;
import java.io.*;

public class MaximunPairwise {
	
	static int getMaxpair(int arr[])
	{
		int product = 0;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 product = Math.max(product,arr[i]*arr[j]);
			 }
		 }
		 return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println(getMaxpair(arr));
	}

}
