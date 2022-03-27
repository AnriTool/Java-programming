package com.anritool.third;

public class Main {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		//�������� ���������
		stack.add(1); stack.add(5); stack.add(2);
		stack.add(3); stack.add(42); stack.add(42);
		stack.remove();//������ ��������� ��������
		System.out.println(stack.toString());
		System.out.println(stack.lessCount(5));
		
		//�������� �� ������������� ���������(�� ���)
		if(stack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		//�������� �������� ������� ����������, � ����� �������� �� ����������
		stack.add(3);
		if(stack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		
		//�������� �� ����� ����������� �������, ��� ������������� ������
		MyStack charStack = new MyStack();
		charStack.add(new Char("Billy" , 48));
		charStack.add(new Char("Van" , 49));
		charStack.add(new Char("Ricardo" , 45));
		charStack.add(new Char("noRicardo" , 45));
		System.out.println(charStack.toString());
		
		if(charStack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		//������ ���� �������� ����� ��������� ������������
		charStack.remove();
		if(charStack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		
		
	} 
}
