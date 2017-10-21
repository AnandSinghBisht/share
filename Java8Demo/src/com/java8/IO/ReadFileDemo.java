package com.java8.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("E:\\test.txt"));
		String str;
		if((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();
	}

}
