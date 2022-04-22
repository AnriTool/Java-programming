package com.anritool.genericclass;
import java.lang.reflect.Array;
public class GenericClass<X> {
	//private X[] arrayList = (X[])new Object[10];
	private Object[] arrayList = new Object [10] ;
	private int counter;
	int max = 5;

//Методы должны генерировать исключение при попытке добавить данное в уже заполненный контейнер и удалить из пустого контейнера. 
	
	//метод добавления данных
	public void add(X x) throws ExceptionFull { 
		if (counter < max) {
			arrayList[counter] = x;
			counter++;
		}
		else {
			throw new ExceptionFull(); //Генерация исключения
		}
	}
	
	//метод удаления данных
	public void del() throws ExceptionEmpty { 
		if (counter > 0) {
			counter--;
		}
		else {
			throw new ExceptionEmpty();//Генерация исключения
		}
	}
	
	//поиска элементов. Метод генерирует исключение, если контейнер пуст.
	public boolean find(X x) throws ExceptionEmpty { 
		if (counter == 0) {
			throw new ExceptionEmpty();//Генерация исключения
		}
		else {
			for (int i = 0; i < counter; i++) {
				if (arrayList[i] == x) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}