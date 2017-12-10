package com.java8.hackerRank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateConverter {

	public static void main(String...a)
	{
		
	Scanner input=new Scanner(System.in);
	String date=input.next();
	String result=timeConversion(date);
	System.out.println(result);
	
	}

	private static String timeConversion(String datetest) {
		// TODO Auto-generated method stub
			DateFormat date=new SimpleDateFormat("hh:mm:ss");
			
			try{
				System.out.println("asdfsdfsaf");
				System.out.println("-----------:"+date.parse(datetest).getHours());
				int i=date.parse(datetest).getHours();
				int j=0;
				System.out.println(i);
				if(i<12)
				{
					j=12;
				}
				System.out.println(j);
				String me=new SimpleDateFormat("HH:mm:ss a").format(date.parse(datetest).getTime());
				
				Calendar  cal=Calendar.getInstance();
				cal.setTime(date.parse(datetest));
				cal.add(Calendar.HOUR, j);
				String m=new SimpleDateFormat("HH:mm:ss a").format(cal.getTime());
				System.out.println(me);
				System.out.println(m);
			}catch(ParseException e){
				e.printStackTrace();
			}
		return "a";
	}
}
