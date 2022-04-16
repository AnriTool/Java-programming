package com.anritool.treesetandlinkedlist;
import java.util.*;




public class Main {
	//Функция формирующая по LinkedList множество TreeSet из эллементов больше заданного
	public static TreeSet<Class> Convert(LinkedList <Class> lst, Class mre){
		TreeSet<Class> ts = new TreeSet<Class>();
		for(int i = 0; i < lst.size();i++) {
			if (mre.compareTo(lst.get(i)) < 0) {
				ts.add(lst.get(i));
			}
		}
		return ts;
	}
	
	
	public static void main(String[] args) {
		LinkedList <Class> ll = new LinkedList <Class>(); //Возможность хранить мой класс в структуре LinkedList
		
		ll.add(new Class("Billy" , 48));
		ll.add(new Class("Van" , 49));
		ll.add(new Class("Ricardo" , 45));
		ll.add(new Class("noRicardo" , 45));
		 
		//использование функции формирующей по LinkedList множество TreeSet из эллементов больше заданного
		TreeSet<Class> tss = Convert(ll,new Class("Ricardo" , 46)); 
		System.out.println("TreeSet: " + tss);  	
	} 
}

/*

Определить произвольный класс таким образом, чтобы имелась возможность хранить его 
объекты в стандартных структурах LinkedList и TreeSet. Для этого реализовать у него 
интерфейс Comparable и перегрузить метод compareTo( ).
Написать функцию, формирующую по заданному списку (LinkedList) множество (TreeSet) 
из элементов списка, больше заданного. 
Распечатать полученное множество

*/
