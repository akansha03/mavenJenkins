package com.amadeus.airCanadaPages;

import java.util.Scanner;

public class SplitString {

	public static void main(String args[])
	{
		int t=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		t = sc.nextInt();
		StringBuffer []sb = new StringBuffer[2];
		String []sd = new String[t];
		
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the String seperated by dots");
			sd[i] = sc.next();
			
			String []sd1 = sd[i].split(".");
			for(int j=sd1.length-1;j>=0;j--)
			{
				
				
			}
		}		
	}
}
