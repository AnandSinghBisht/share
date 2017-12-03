package com.java8.sorting;

public class InsertSorting {

	static void sort(int arr[])
    {
	int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
				
				
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		
			
			
		}
    }
	
	public static void main(String...a)
	{
		int [] integer={11,10,25,11,4,54};
		
		sort(integer);
		for(int i:integer)
		{
			System.out.print(i+" ");
		}
	}
}
