package com.anritool.treesetandlinkedlist;

//����������� ����� � ��������������� ��������
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

//���� ���������� �� ��������
	@Override
	public int compareTo(Class o) {
		return age.compareTo(o.age);
	}
}
