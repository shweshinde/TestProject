package com.assignment_10Aug;

public class MyDate {
	int day;
	int month;
	int year;
	public MyDate(int day, int month, int year)
	{
		this.day= day;
		this.month= month;
		this.year= year;
	}
	public void show()
	{
		System.out.println("Day is..:" +day);
		System.out.println("Month is..:" +month);
		System.out.println("Year is..:" +year);
	}

}
