package com.anritool.treesetandlinkedlist;
import java.util.*;




public class Main {
	//������� ����������� �� LinkedList ��������� TreeSet �� ���������� ������ ���������
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
		LinkedList <Class> ll = new LinkedList <Class>(); //����������� ������� ��� ����� � ��������� LinkedList
		
		ll.add(new Class("Billy" , 48));
		ll.add(new Class("Van" , 49));
		ll.add(new Class("Ricardo" , 45));
		ll.add(new Class("noRicardo" , 45));
		 
		//������������� ������� ����������� �� LinkedList ��������� TreeSet �� ���������� ������ ���������
		TreeSet<Class> tss = Convert(ll,new Class("Ricardo" , 46)); 
		System.out.println("TreeSet: " + tss);  	
	} 
}

/*

���������� ������������ ����� ����� �������, ����� ������� ����������� ������� ��� 
������� � ����������� ���������� LinkedList � TreeSet. ��� ����� ����������� � ���� 
��������� Comparable � ����������� ����� compareTo( ).
�������� �������, ����������� �� ��������� ������ (LinkedList) ��������� (TreeSet) 
�� ��������� ������, ������ ���������. 
����������� ���������� ���������

*/
