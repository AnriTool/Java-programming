package com.anritool.dociscorrect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static boolean addressIsCorrect(String S){
		String pattern = "^\\w+, \\w+, \\w+, \\w+, \\d{6}$"; //Слово, слово, слово, слово, 6 цифр индекса - для адресса 
		Pattern ptrn = Pattern.compile(pattern);
		Matcher matcher = ptrn.matcher(S);
		if(matcher.find()){
			return true;
		}
		else {
			return false;
		}
	}	

	public static boolean SNILSIsCorrect(String S){
		String pattern = "^\\d{3}-\\d{3}-\\d{3} \\d{2}$"; //xxx-xxx-xxx xx - формат снилса
		Pattern ptrn = Pattern.compile(pattern);
		Matcher matcher = ptrn.matcher(S);
		if(matcher.find()){
			return true;
		}
		else {
			return false;
		}
	}	

	public static boolean passIsCorrect(String S){
		String pattern = "^\\d{2} \\d{2} \\d{6}$"; //xx xx xxxxxx - формат паспорта
		Pattern ptrn = Pattern.compile(pattern);
		Matcher matcher = ptrn.matcher(S);
		if(matcher.find()){
			return true;
		}
		else {
			return false;
		}
	}	

	public static boolean userIsCorrect(String S){
		String pattern = "^\\w+ \\w+ \\w+ \\d{2}.\\d{2}.\\d{4} \\w+"; //Фамилия Имя Отчество xx.xx.xxxx Место_Рождения
		Pattern ptrn = Pattern.compile(pattern);
		Matcher matcher = ptrn.matcher(S);
		if(matcher.find()){
			return true;
		}
		else {
			return false;
		}
	}	
	
	

	public static void main(String[] args) {
		if(addressIsCorrect("Vladivostok, Krasnoarmeyskaya, 15, 2, 666666")) {
			System.out.println("Address is correct");
		} else {System.out.println("Address is incorrect");}
		
		if (SNILSIsCorrect("111-111-111 11")) {
			System.out.println("SNILS is correct");
		} else {System.out.println("SNILS is incorrect");}
		
		if (passIsCorrect("11 11 111111")) {
			System.out.println("pass is correct");
		} else {System.out.println("pass is incorrect");}
		
		if (userIsCorrect("Ryndin Andrey Aleksandrovich 15.03.2002 Chernigovskiy r-n")) {
			System.out.println("User data is correct");
		} else {System.out.println("User data is incorrect");}
		
	}

}

/*

Задание к теме 4 часть 1
Разработать статическую функцию типа static bool isCorrect(String str), принимающую на вход строку и проверяющую, корректно ли заданы (на выбор):
- почтовый адрес проживания,
- персональные данные (паспорт, регистрация, СНИЛС),
- фамилия, имя, отчество, дата, год и место рождения,
- выходные данные книги (авторы, название, издательство, место издания, год издания, количество страниц),
- выходные данные статьи (авторы, название, журнал, номер, год, страницы).
Предпочтительно использовать механизм регулярных выражений.

*/