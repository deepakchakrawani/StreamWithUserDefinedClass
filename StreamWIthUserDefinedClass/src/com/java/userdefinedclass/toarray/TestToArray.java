package com.java.userdefinedclass.toarray;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.java.userdefinedclass.entity.Student;

public class TestToArray {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Nitin", 65));
		students.add(new Student("Deepak", 80));
		students.add(new Student("Roshan", 40));
		students.add(new Student("Jayendra", 50));
		students.add(new Student("Chintu", 25));
		
		System.out.println(students);
		
		Student [] studentArray = students.stream().toArray(Student[]::new);
		
		for(Student s : studentArray) {
			System.out.println(s);
		}
		
		System.out.println("print using Stream.of() :: ");
		//use of Stream.of()
		Stream.of(studentArray).forEach(System.out::println);

	}

}
