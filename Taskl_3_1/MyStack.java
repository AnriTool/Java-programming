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
    
//������ ���������� ������ � �������� ������. ~~
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
    
//�����, ������������ ����� ���������, ������ ��������� ~~
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
    
//�����, ������������ true, ���� ���� ������������� ��������.    
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
����������� �����-�������� ��� �������� ������. 
������ ������ ��������� � ���� (��������, ArrayList), ������������ ������������ �������� (��������, 10 ���������). 
����������� ������ ���������� ������ � �������� ������ (��������, �� �������� �����). 
������ ������ ��������� ����������� ���������� � �������� � ����� ������ ���������� ������ � �� ������ ������, ���� ���������� 
��� �������� ����� �������������.
����� ����, ����� ����������� ��������� ������ ������: 
- �����, ������������ ����� ���������, ������ ���������;
- �����, ������������ true, ���� ���� ������������� ��������.
������������������ ������ ������� �� �������� ��� ����������� ����, 
��� � 
������������ ������. ��� ����� ������� ����������� ����� � ����������� � �� ������ 
������.

*/