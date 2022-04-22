package com.anritool.genericclass;

public class main {	
	public static void main(String[] args) {
		
		GenericClass<Integer> GC = new GenericClass();
		
		try {
			GC.add(1);GC.add(1);GC.add(1);GC.add(1);GC.add(1);GC.add(1);
        } catch (ExceptionFull ex) {
           // System.err.print(ex);
        }
		
		System.out.println("\n\n");
		
		try {
			GC.del();GC.del();GC.del();GC.del();GC.del();GC.del();GC.del();GC.del();
        } catch (ExceptionEmpty ex) {
          //  System.err.print(ex);
        }
		
		System.out.println("\n\n");
		try {
			GC.find(1);
        } catch (ExceptionEmpty ex) {
            //System.err.print(ex);
        }
		
		System.out.println("\n\n");
		
		try {
			GC.add(1);GC.add(1);GC.add(1);GC.add(1);GC.add(1);
			GC.find(1);
        } catch (ExceptionEmpty | ExceptionFull ex) {
           // System.err.print(ex);
        }
	} 
}

/*

Разработать класс-дженерик для хранения данных. 
Данные должны храниться в поле ArrayList, ограниченном максимальным размером (например, 10 элементов). 
Реализовать методы добавления данных и удаления данных (например, по принципу стека). 
Методы должны генерировать исключение при попытке добавить данное в уже заполненный контейнер и удалить из пустого контейнера. 
Для этого создать свои классы исключений. 
Кроме этого реализовать один из следующих методов (на выбор):
* сортировки элементов. Метод генерирует исключение при попытке сортировать пустой контейнер или если все его элементы - равны;
* поиска элементов. Метод генерирует исключение, если контейнер пуст.
* поиска элементов. Метод генерирует исключение, если контейнер содержит больше одного искомого элемента.
* сложения элементов. Метод генерирует исключение, если контейнер пуст.
* перемножения элементов. Метод генерирует исключение, если один из элементов контейнера равен 0
 
 
 */
