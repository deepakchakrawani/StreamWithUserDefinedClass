package com.java.userdefinedclass.count;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.userdefinedclass.entity.Student;

public class TestCount {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Deepak", 80));
		students.add(new Student("Nitin", 65));
		students.add(new Student("Jayendra", 50));
		students.add(new Student("Roshan", 40));
		students.add(new Student("Chintu", 25));
		
		System.out.println(students);
		//find the count of student whose having marks >=50 and name containing more then 6 alphabet 
		long stuCount = students.stream().filter(s->s.getName().length()>6 && s.getMarks()>=50).count();
		
		
		System.out.println("---------------------Students Count-------------------");
		System.out.println(stuCount);

	}

}
