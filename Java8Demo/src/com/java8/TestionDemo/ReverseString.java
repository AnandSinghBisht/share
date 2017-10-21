package com.java8.TestionDemo;

public class ReverseString {
	
	public static boolean getPalindrome(String str,int low,int high)
	{
		if(high<=low)
		{
			return true;
		}else if(str.charAt(low)!=str.charAt(high)){
			return false;
		}
		return getPalindrome(str,low+1,high-1);
	}

	public static void main(String[] args) {
		String str="BABA";
		if(getPalindrome(str,0,str.length()-1)){
			System.out.println("Palindrome");
		}else
		{
			System.out.println("not Palindrome");
		}
	
	}
}
