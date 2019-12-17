package com.functioninterface_;



@FunctionalInterface
interface PersonBuilder{
	Person builderPerson(String name);
}
class Person{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
public class E26 {

	public static void main(String[] args) {
		PrinterName("刘德华",new PersonBuilder() {
			
			@Override
			public Person builderPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
		});
		PrinterName("郭富城",name->new Person(name));
		PrinterName("张学友",Person::new);

	}

	private static void PrinterName(String name, PersonBuilder pb) {
		System.out.println(pb.builderPerson(name).getName());
	}

}
