package com.java8.sorting;

import java.util.Arrays;

public class BinearySearch {
	
	static int binarySearch(int[] arr,int l,int r,int x)
	{
		System.out.println(arr);
		if(r>=1){
		int mid=l+(r-1)/2;
		if(arr[mid]==x)
		
			return mid;
		
		if(arr[mid]>x)
		
			return binarySearch(arr,l,mid-1,x);
		
			return binarySearch(arr,mid+1,r,x);
		
		}
		return -1;
	}

	public static boolean binarySearch(int []array,int x)
	{
		System.out.println("------------->>>");
		int left=0;
		int right=array.length-1;
		while(left<=right)
		{
			int mid=left+((right-left)/2);
			if(array[mid]==x){
				return true;
					}
			else if(x<array[mid])
			{
					right=mid-1;
			}else{
				left=mid+1;
			}
		}
		return false;}
	public static void main(String[] args) {
		int arr[] = {2,25,44,3,4,10,40,54};
        int n = arr.length;
        
        System.out.println(binarySearch(arr,25)); 
       /* Arrays.sort(arr);
        int x = 25;
        int result = binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);*/
	}
}
