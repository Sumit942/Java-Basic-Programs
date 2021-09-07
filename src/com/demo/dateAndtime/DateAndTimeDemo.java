package com.demo.dateAndtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTimeDemo {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate date = LocalDate.now();
		
		LocalDate yesterday = date.minusDays(1);
		
		LocalDate tomorrow = date.plusDays(1);
		
		LocalDate bday = LocalDate.of(2021, 10, 1);
		
		System.out.println("Today's date:\t\t"+formatter.format(date));
		
		System.out.println("Yesterday's date:\t"+yesterday.format(formatter));
		
		System.out.println("Tomorrow's date:\t"+tomorrow.format(formatter));
		
		System.out.println("Your Birthday:\t\t"+bday.format(formatter));
	}

}
