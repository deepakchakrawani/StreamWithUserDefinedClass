package com.java.userdefinedclass.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.userdefinedclass.entity.Student;

public class TestFilter {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Deepak", 80));
		students.add(new Student("Nitin", 65));
		students.add(new Student("Jayendra", 50));
		students.add(new Student("Roshan", 40));
		students.add(new Student("Chintu", 25));
		
		System.out.println(students);
		//filter those student whose having marks >=60
		List<Student> filteredStu = students.stream().filter(s->s.getMarks()>=60).collect(Collectors.toList());
		
		System.out.println("---------------------students whose having marks >=60-------------------");
		
		filteredStu.stream().forEach(System.out::println);
		

	}

}
