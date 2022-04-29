package com.anritoo.fileIO;


import java.io.*;
import java.util.*;

public class main {
	//Реализовать методы сохранения данных о человеке в файл и загрузки данных о человеке из файла, используя механизм сериализации. 
	public static void writeOne(String path, Human h) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(path);
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

	    objectOutputStream.writeObject(h);
	    objectOutputStream.close();
		
	}
	
	public static Human readOne(String path) throws IOException, ClassNotFoundException {
		File f = new File(path);
		Human h;
		if (f.isFile()) {
			FileInputStream fileInputStream = new FileInputStream(path);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		    h = (Human) objectInputStream.readObject();
		    objectInputStream.close(); 
		}
		else {
			h = new Human("FILE", "NOT", 0 , "FOUND");
		}
		return h;
	}
	
	//Реализовать методы сохранения массива с людьми в текстовый файл и загрузки данных в массив из текстового файла. 
	public static void writeMore(String path ,List<Human> Humans) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(path);
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

	    objectOutputStream.writeObject(Humans);
	    objectOutputStream.close();
	}
	
	public static ArrayList<Human> readMore(String path) throws IOException, ClassNotFoundException {
		File f = new File(path);
		ArrayList<Human> h;
		if (f.isFile()) {
			FileInputStream fileInputStream = new FileInputStream(path);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		    h = (ArrayList<Human>) objectInputStream.readObject();
		    objectInputStream.close(); 
		}
		else {
			h = new ArrayList<Human>();
			h.add(new Human("FILE", "NOT", 0 , "FOUND"));
		}
		return h;
	}
	
	
	
	
	public static void main(String[] args)  throws IOException, ClassNotFoundException  {
		//Path name = Path.of("name.txt");
		//Path names = Path.of("names.txt");
		Human Andrey = new Human("Andrey", "Ryndin", 2002, "Sibircevo");
		List<Human> Humans = new ArrayList<Human>();
		List<Human> fromFile;
		Humans.add(Andrey);
		Humans.add(new  Human("Billy", "Herington", 1969, "North Babylon"));
		Humans.add(new  Human("Van", "Darkholme", 1972 , "Vietnam"));
		Humans.add(new  Human("Ricardo", " Milos", 1977, "Rio de Janeiro"));
		
		writeOne("name.txt", Andrey);
		System.out.println(readOne("name.txt").toString());
		
		
		writeMore("names.txt", Humans);
		fromFile = readMore("names.txt");
		for(int i = 0; i < fromFile.size(); i++) {
			System.out.println(fromFile.get(i).toString());
		}
	}

}


/*

Задание к теме 5 часть 1
Файловый и потоковый ввод и вывод. Сериализация.
- Разработать класс для хранения данных о человеке (имя, фамилия, год рождения, адрес и т.п.). 
- Реализовать методы сохранения данных о человеке в файл и загрузки данных о человеке из файла, используя механизм сериализации. 
- Реализовать методы сохранения массива с людьми в текстовый файл и загрузки данных в массив из текстового файла. 
Текстовый файл должен быть удобного для чтения формата (например, в виде таблицы)

*/