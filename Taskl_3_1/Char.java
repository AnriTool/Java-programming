package com.anritool.third;


//Собственный класс с перезаписанными методами
public class Char implements Comparable <Char>{
	private Integer age;
	private String name;
	
	public Char(String n, int a) {
		this.age = a; this.name = n;
	}
	
	
	@Override
	public String toString() {
		return name + " " + age;
	}

//Буду сравнивать просто по возрасту
	@Override
	public int compareTo(Char o) {
		return age.compareTo(o.age);
	}
}
