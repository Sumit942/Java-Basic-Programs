package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		System.out.println("Employee.Employee()");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		System.out.println("Employee.hashCode() " + name);
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.print("Employee.equals() " + name);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		System.out.println(" other name: " + other.name);
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class HashMapDemo {

	public static void main(String[] args) {

		int a[] = new int[6];

		for (int i = 0; i < a.length; i++) {

			if (i != 5)
				a[i] = i + 1;
		}
		long start = System.currentTimeMillis();
		findMissingNumber1(a);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

	private static void findMissingNumber1(int[] a) {
		
		int sum = ((a.length + 1) * (a.length +1) )/ 2;
		System.out.println("Sum: " + sum);
		int aSum = 0;
		for (int no: a)
			aSum += no;
		
		System.out.println("Missing no is: " + (sum-aSum));
	}

}
