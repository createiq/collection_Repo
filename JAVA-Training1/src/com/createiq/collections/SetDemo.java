package com.createiq.collections;

import java.util.Set;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
    Set<String> course=new HashSet<>();
    course.add("Core Java");
    course.add("Advance Java");
    course.add("Sql");
    course.add("Spring Boot");
    course.add("Hibernate");
    course.add("Micro Services");
    course.add(null);
    
    System.out.println(course);
    
    course.forEach(courses->System.out.println(courses));
	}

}
