package com.java8.collection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestArticle {
	
	public static Date convertMainupate(Date date,int nextYear,int nextMonth,int nextDay)
	{
		DateFormat formate=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		System.out.println(formate.format(date));
		
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.YEAR, nextYear);
		c.add(Calendar.MONTH, nextMonth);
		c.add(Calendar.DATE, nextDay);
		
		Date newDate=c.getTime();
		System.out.println(formate.format(newDate));
		return newDate;
	}

	
	public static void main(String[] args) {
		
		Article articleObj=new Article(4,"anand",convertMainupate(new Date(), 0, 1, 0));
		Article articleObj1=new Article(8,"Durga",convertMainupate(new Date(), 0, 2, 0));
		Article articleObj2=new Article(2,"Murga",convertMainupate(new Date(), 0, 3, 0));
		Article articleObj3=new Article(1,"Fukra",convertMainupate(new Date(), 0, 4, 0));
		
		List<Article> articleLst=new ArrayList<Article>();
		articleLst.add(articleObj);
		articleLst.add(articleObj1);
		articleLst.add(articleObj2);
		articleLst.add(articleObj3);
		
		Collections.sort(articleLst,Article.dateComparatorDes);
		
		System.out.println(articleLst);
		
		
		
	}

}
