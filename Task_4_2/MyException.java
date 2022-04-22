package com.anritool.genericclass;

//свои классы исключений. 
public class MyException extends Throwable {
	public MyException(String s) {
		System.out.println(s);
	}
}


class ExceptionFull extends MyException {
	public ExceptionFull() {
		super("ArrayIsFull");
	}
}


class ExceptionEmpty extends MyException {
	public ExceptionEmpty() {
		super("ArrayIsEmpty");
	}
}
