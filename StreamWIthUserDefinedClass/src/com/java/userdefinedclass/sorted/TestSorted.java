package com.java.userdefinedclass.sorted;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.userdefinedclass.entity.Student;

public class TestSorted {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Nitin", 65));
		students.add(new Student("Deepak", 80));
		students.add(new Student("Roshan", 40));
		students.add(new Student("Jayendra", 50));
		students.add(new Student("Chintu", 25));
		
		System.out.println(students);
		//sort students in acs order based on there marks. //CompareTo mehod is implements in Student Class for marks.
		List<Student> sortOnMarks= students.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("---------------------Sort on the basis of marks-------------------");
		System.out.println(sortOnMarks);
		List<Student> sortOnName = students.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
		System.out.println("---------------------Sort on the basis of name-------------------");
		System.out.println(sortOnName);
		

	}

}
