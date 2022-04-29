package com.anritoo.fileIO;
import java.io.Serializable;

//Разработать класс для хранения данных о человеке (имя, фамилия, год рождения, адрес и т.п.). 
public class Human implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String name;
	String surname;
	int birthyear;
	String city;
	
	public Human(String N, String S, int B, String C) {
		name = N; surname = S; birthyear = B; city = C;
	}
	
	@Override
	public String toString() {
		return (name + " " + surname + " " + birthyear + " " + city);
	}

}
