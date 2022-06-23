package org.java.collection1;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		
		Vector<Integer> v0 = new Vector<Integer>();
		v0.add(1000);
		v0.add(2000);
		v0.add(3000);
		
		Vector<Integer> v1 = new Vector<Integer>();
		
		//�ڽ� new�� ����
		v1.add(new Integer(10));
		v1.add(new Integer(20));
		//���� �ڽ�
		v1.add(30);
		v1.add(40);
		v1.add(50);		
		
		System.out.println("v1.size = "+v1.size());	//����� �� ����
		
		for (Integer i : v1) {
			System.out.println(i);
		}
		
		System.out.println("==========================");
		
		v1.add(2, 2000);	//2���� �ڿ� ��� �߰�(3������ ��)
		
		System.out.println("v1.size = "+v1.size());
		
		for (Integer i : v1) {
			System.out.println(i);
		}
		
		//v1.clear(); ����� ����
		System.out.println("===========================");
		
		v1.addAll(v0); //v1�� v0�� �߰���(v1�ڿ� �´�)
		System.out.println("v1.size+v0 = "+v1.size());
		for (Integer i : v1) {
			System.out.println(i);
		}
		
		System.out.println("===========================");
		System.out.println(v1.contains(1000));	//��Ұ� ���ԵǾ� �ִ���
		System.out.println(v1.elementAt(0));	//0���� ��� �����ΰ�
		System.out.println("===========================");
		System.out.println(v1.indexOf(10));	//10����� �ε����� �����?  (������ -)
		System.out.println(v1.indexOf(1000));
		System.out.println("===========================");
		
//		v1.removeAllElements();	//������ ��� ���� ����
		System.out.println(v1.size());	//��� �뷮
		System.out.println(v1.capacity()); //�迭 �뷮
		System.out.println(v1.isEmpty()); //��Ұ� ����ִ°�
		
	}
}
