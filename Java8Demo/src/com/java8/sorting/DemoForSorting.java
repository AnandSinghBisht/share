package com.java8.sorting;

public class DemoForSorting {

	public static void insertSort(int [] iteam)
	{
		int l=iteam.length;
		for(int i=0;i<l-1;i++)
		{
			int min=i;
			for(int j=i+1;j<l;j++)
			{
				if(iteam[j]<iteam[min])
				{
					min=j;
				}
				
			}
			int team=iteam[min];
			iteam[min]=iteam[i];
			iteam[i]=team;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[]={2,5,6,4,1,2,5,8};
		insertSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
