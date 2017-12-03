package com.java8.hackerRank;

import java.util.Stack;

public class BalanceStringDemo {
	
	public static char[][] TOKEN={{'{','}'},{'(',')'},{'[',']'}};	
	public static boolean isOpen(char open)
	{
		
		for(char[] array:TOKEN)
		{
			if(array[0]==open)
			{
				return true;
			}
		}
		return false;
		
	}
	
	public static boolean isMatched(char open,char close)
	{
		for(char[] array:TOKEN)
		{
			if(array[0]==open)
			{
				return array[1]==close;
			}
		}
		return false;
	}

	

	public static boolean isBalance(String str)
	{
		Stack<Character> stack=new Stack<Character>();
		for(char c:str.toCharArray())
		{
			if(isOpen(c))
			{
					stack.push(c);
			}
			else
			{
				if(stack.isEmpty() || !isMatched(stack.pop(), c))
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
		
	}
public static void main(String[] args) {
	String str="{()()}";
	System.out.println(isBalance(str));
}


}