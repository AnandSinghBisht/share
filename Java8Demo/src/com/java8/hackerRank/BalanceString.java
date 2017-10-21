package com.java8.hackerRank;

import java.util.Stack;

public class BalanceString {
	public static char[][] TOKENS={{'{','}'},{'(',')'},{'[',']'}};
	
	public static boolean isOpenTerm(char ch)
	{
		for(char [] array:TOKENS)
		{
			if(array[0]==ch)
			{
				return true;
			}
		}
		return false;
	}
	public static boolean matches(char openTerm, char closeTerm)
	{
		for(char [] array:TOKENS)
		{
			if(array[0]==openTerm)
			{
				return array[1]==closeTerm;
			}
		}
		return false;
	}
	public static boolean isBalance(String expression)
	{
		Stack<Character> stack=new Stack<Character>();
		
		for(char c:expression.toCharArray()){
			if(isOpenTerm(c))
			{
				stack.push(c);
			}else
			{
				if(stack.isEmpty() || !matches(stack.pop(),c)){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		
		
		String str="{()(){)}";
		System.out.println(isBalance(str));
	}

}
