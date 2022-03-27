package com.anritool.third;

public class Main {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		//ƒобавл€ю эллементы
		stack.add(1); stack.add(5); stack.add(2);
		stack.add(3); stack.add(42); stack.add(42);
		stack.remove();//”дал€ю последний эллемент
		System.out.println(stack.toString());
		System.out.println(stack.lessCount(5));
		
		//ѕровер€ю на повтор€бщиес€ эллементы(их нет)
		if(stack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		//ƒобавл€ю эллемент который существует, и снова провер€ю на повторени€
		stack.add(3);
		if(stack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		
		//ѕровер€ю со своим собственным классом, где перезаписанны методы
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
		//”дал€ю один эллемент чтобы проверить правильность
		charStack.remove();
		if(charStack.repetitive()) {
			System.out.println("Repetitive");
		}
		else {
			System.out.println("No repetitive");
		}
		
		
		
	} 
}
