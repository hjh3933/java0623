package org.java.collection1;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		
		Vector<Integer> v0 = new Vector<Integer>();
		v0.add(1000);
		v0.add(2000);
		v0.add(3000);
		
		Vector<Integer> v1 = new Vector<Integer>();
		
		//박싱 new로 넣음
		v1.add(new Integer(10));
		v1.add(new Integer(20));
		//오토 박싱
		v1.add(30);
		v1.add(40);
		v1.add(50);		
		
		System.out.println("v1.size = "+v1.size());	//요소의 총 개수
		
		for (Integer i : v1) {
			System.out.println(i);
		}
		
		System.out.println("==========================");
		
		v1.add(2, 2000);	//2번지 뒤에 요소 추가(3번지에 들어감)
		
		System.out.println("v1.size = "+v1.size());
		
		for (Integer i : v1) {
			System.out.println(i);
		}
		
		//v1.clear(); 모든요소 삭제
		System.out.println("===========================");
		
		v1.addAll(v0); //v1에 v0을 추가함(v1뒤에 온다)
		System.out.println("v1.size+v0 = "+v1.size());
		for (Integer i : v1) {
			System.out.println(i);
		}
		
		System.out.println("===========================");
		System.out.println(v1.contains(1000));	//요소가 포함되어 있는지
		System.out.println(v1.elementAt(0));	//0번지 요소 무엇인가
		System.out.println("===========================");
		System.out.println(v1.indexOf(10));	//10요소의 인덱스는 몇번지?  (없으면 -)
		System.out.println(v1.indexOf(1000));
		System.out.println("===========================");
		
//		v1.removeAllElements();	//벡터의 모든 값을 삭제
		System.out.println(v1.size());	//요소 용량
		System.out.println(v1.capacity()); //배열 용량
		System.out.println(v1.isEmpty()); //요소가 비어있는가
		
	}
}
