package com.java.userdefinedclass.minmax;

import java.util.ArrayList;

import com.java.userdefinedclass.entity.Student;

public class TestMinMax {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Nitin", 65));
		students.add(new Student("Deepak", 80));
		students.add(new Student("Roshan", 40));
		students.add(new Student("Jayendra", 50));
		students.add(new Student("Chintu", 25));
		
		System.out.println(students);
		
		Student min = students.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Student Having min marks : "+min);
		Student max = students.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Student Having max marks : "+max);
		

	}

}
