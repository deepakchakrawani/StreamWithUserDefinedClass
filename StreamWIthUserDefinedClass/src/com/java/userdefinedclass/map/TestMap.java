package com.java.userdefinedclass.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.userdefinedclass.entity.Student;

public class TestMap {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Deepak", 80));
		students.add(new Student("Nitin", 65));
		students.add(new Student("Jayendra", 50));
		students.add(new Student("Roshan", 40));
		students.add(new Student("Chintu", 25));
		
		System.out.println(students);
		//map "-map" after every student's name
		List<Student> modifiedStu = students.stream().map(s->{
			s.setName(s.getName()+"-Map");
			return s;
		}).collect(Collectors.toList());
		
		
		System.out.println("---------------------Modified Students-------------------");
		
		modifiedStu.stream().forEach(System.out::println);

	}

}
