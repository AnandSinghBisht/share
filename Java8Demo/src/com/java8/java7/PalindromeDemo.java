package com.java8.java7;

public class PalindromeDemo {
	
	
	public boolean checkPalindrome(String str,int low,int high)
	{
		
		if(high<=low)
		{
			return true;
		}else if(str.charAt(low)!=str.charAt(high)){
			return false;
		}
		else
			return checkPalindrome(str, low+1, high-1);
	}
	
	public static void main(String[] args) {
		
		PalindromeDemo demo=new PalindromeDemo();
		String str="dad";
		if(demo.checkPalindrome(str, 0, str.length()-1))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
			
		
	}

}
