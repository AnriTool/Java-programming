package com.anritool.third;

import java.util.*;

public class MyStack <T extends Comparable> {
    private final int MAX = 10;
    private int size;
    private ArrayList<T> array;
   
    public MyStack ()  {
         size = 0;
         array = new ArrayList<>(MAX);
    }
    
//Методы добавления данных и удаления данных. ~~
    public void add(T x) {
        if (size < MAX) {
            array.add(x);
            size++;            
        }        
    }
    
    public void remove() {
        if (size > 0) {
        	array.remove(size-1);
            size--;            
        }        
    }
//~~
    
    public boolean isSmaller(T x)
    {
        for (int i = 0; i < size; i++)
        {
            if (x.compareTo(array.get(i)) < 0 ) {
                return true;
            }                   
        }
        return false;        
    }
    
//Метод, возвращающий число элементов, меньше заданного ~~
    public int lessCount(T x)
    {
    	int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (x.compareTo(array.get(i)) > 0 ) {
                count++;
            }                   
        }
        return count;        
    }
//~~
    
//Метод, возвращающий true, если есть повторяющиеся элементы.    
    public boolean repetitive()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = i+1; j < size; j++) {
            	if (array.get(i).compareTo(array.get(j)) == 0) {
            			return true;
            	}
            }             
        }
        return false;        
    }
//~~    
    
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++)
        {
            result = result + array.get(i) + ", ";
            
        }
        return result;
    }
}

/*
Разработать класс-дженерик для хранения данных. 
Данные должны храниться в поле (например, ArrayList), ограниченном максимальным размером (например, 10 элементов). 
Реализовать методы добавления данных и удаления данных (например, по принципу стека). 
Методы должны проверять возможность добавления и удаления с точки зрения количества данных и не делать ничего, если добавление 
или удаление будут некорректными.
Кроме того, нужно разработать следующие методы класса: 
- метод, возвращающий число элементов, меньше заданного;
- метод, возвращающий true, если есть повторяющиеся элементы.
Продемонстрировать работу шаблона на объектах как встроенного типа, 
так и 
собственного класса. Для этого создать собственный класс и перегрузить в нём нужные 
методы.

*/