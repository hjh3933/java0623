package org.java.generic;

import java.util.LinkedList;

public class QueueEx1 {
	public static void main(String[] args) {
		
		LinkedList<String> qu = new LinkedList<String>();
		
		qu.add("��");
		qu.add("��");
		qu.add("��");
		qu.add("�ϳ�");
		
		// peek�޼ҵ带 �̿��� ����� ��ȯ
		System.out.println(qu.peek());
		System.out.println(qu);
		//poll�޼ҵ带 �̿��� ����� ��ȯ �� ����(�������� �� ����)
		System.out.println(qu.poll());
		System.out.println(qu);
		//remove�޼ҵ带 �̿��� ����� ����(��������)
		qu.remove("�ϳ�");
		System.out.println(qu);
	}
}
