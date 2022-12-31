package com.demo.hibernate;

import java.util.HashMap;
import java.util.Map;

class FirstLevelCache {

	private Map<Class, Map<Object, Object>> cacheMap;

	private Map<Object, Object> entityMap;

	public FirstLevelCache() {
		cacheMap = new HashMap<>();
		entityMap = new HashMap<>();
	}

	public void put(Object id, Object domain) {

		Class clazz = domain.getClass();
		if (!cacheMap.containsKey(clazz)) {
			entityMap = new HashMap<>();
		} else {
			entityMap = cacheMap.get(clazz);
		}

		if (!entityMap.containsKey(id)) {
			entityMap.put(id, domain);
			cacheMap.put(clazz, entityMap);
		}
	}

	public <T> Object fetch(T clazz, Object id) {

		if (cacheMap.containsKey(clazz)) {
			entityMap = cacheMap.get(clazz);

			if (entityMap.containsKey(id)) {
				return entityMap.get(id);
			} else {
				put(id, clazz);
				return clazz;
			}
		} else {
			put(id, clazz);
			return clazz;
		}
	}
}

class Student {
	private int id;
	private String name;
	private int rollNo;

	public Student() {
	}

	public Student(int id, String name, int rollNo) {
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}

}

class MainApp {

	public static void main(String[] args) {

		FirstLevelCache hb = new FirstLevelCache();

		Student s1 = new Student(1, "Sumit", 24);
		Student s2 = new Student(2, "Amit", 26);
		Student s3 = new Student(3, "Sweeti", 28);
		Student s4 = new Student(4, "Shruti", 21);

		Student fetch = (Student) hb.fetch(Student.class, 1);

		System.out.println(fetch);
	}
}