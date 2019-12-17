package com.jihe;

import java.util.HashSet;
class Student{
	String id;
	String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return id.equals(other.id);
	}
	@Override
	public String toString() {
		return id + ":" + name;
	}
	
}

public class HashSet_test {

	public static void main(String[] args) {
		Student stu1=new Student("31", "mike");
		Student stu2=new Student("32", "jack");
		Student stu3=new Student("23", "tom");
		
		HashSet<Student> hset=new HashSet<Student>();
		hset.add(stu3);
		hset.add(stu1);
		hset.add(stu2);
		
		System.out.println(hset);

	}

}
