package com.anritool.third;

public class Main {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		//Добавляю эллементы
		stack.add(1); stack.add(5); stack.add(2);
		stack.add(3); stack.add(42); stack.add(42);
		stack.remove();//Удаляю последний эллемент
		System.out.println(stack.toString());
		System.out.println(stack.lessCount(5));
		
		//Проверяю на повторябщиеся эллементы(их нет)
		if(stack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		//Добавляю эллемент который существует, и снова проверяю на повторения
		stack.add(3);
		if(stack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		
		//Проверяю со своим собственным классом, где перезаписанны методы
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
		//Удаляю один эллемент чтобы проверить правильность
		charStack.remove();
		if(charStack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		
		
	} 
}
