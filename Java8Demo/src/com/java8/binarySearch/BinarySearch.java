package com.java8.binarySearch;

public class BinarySearch {
	
	public static boolean binarySearchRecursive(int[] array,int x,int left,int right){
		
		if(left>right)
		{
			return false;
		}
		int mid=left+((right-left)/2);
		if(array[mid]==x)
		{
			return true;
		}else if(x<array[mid])
		{
			return binarySearchRecursive(array,x,left,mid-1);
		}else
		{
			return binarySearchRecursive(array,x,mid+1,right);
		}
		
	}
	public static boolean binarySearchRecursive(int[] array,int x)
	{
		return binarySearchRecursive(array,x,0,array.length-1);
	}
	
	public static boolean binarySerching(int [] array,int x)
	{
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
		return false;
		
	}
	public static void main(String[] args) {
		
		int x[]={5,3,6,4,5,8,4,1};
		int arr[] = {2,25,44,3,4,10,40,54};
		System.out.println(binarySearchRecursive(x,19));
		System.out.println(binarySerching(x,3));
		System.out.println(binarySerching(x,25));
		System.out.println(binarySerching(arr,25));
		
		
	}

}
