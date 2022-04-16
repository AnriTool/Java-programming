package com.anritool.treesetandlinkedlist;

//Собственный класс с перезаписанными методами
public class Class implements Comparable <Class>{
	private Integer age;
	private String name;
	
	public Class(String n, int a) {
		this.age = a; this.name = n;
	}
	
	
	@Override
	public String toString() {
		return name + " " + age;
	}

//Буду сравнивать по возрасту
	@Override
	public int compareTo(Class o) {
		return age.compareTo(o.age);
	}
}
