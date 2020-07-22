package com.java.userdefinedclass.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.java.userdefinedclass.entity.Student;

public class TestForEach {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Nitin", 65));
		students.add(new Student("Deepak", 80));
		students.add(new Student("Roshan", 40));
		students.add(new Student("Jayendra", 50));
		students.add(new Student("Chintu", 25));
		
		System.out.println(students);
		
		students.stream().forEach(System.out::println);
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, new Student("Nitin", 65));
		map.put(2, new Student("Deepak", 80));
		map.put(3, new Student("Roshan", 40));
		map.put(4, new Student("Jayendra", 50));
		map.put(5, new Student("Chintu", 25));
		
		System.out.println("map elements::");
		map.forEach((key,value)->{
			System.out.println(key+"=>"+value);
		});

	}

}
