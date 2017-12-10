package com.java8.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Candle {
	
	
	public static void main(String[] arg)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
			int [] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=in.nextInt();
			}
		int result=birthdayCandle(arr,n);
		System.out.println(result);
	}

	private static int birthdayCandle(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		int temp=arr[n-1];
		int result=0;
		for(int i=n-1;i>=0;i--)
		{
			if(temp!=arr[i])
			{
				break;
			}
			result++;
		}
		return result;
	}

}
