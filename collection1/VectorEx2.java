package org.java.collection1;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<>();
		v1.add("user1");
		v1.add("user2");
		v1.add("user3");
		v1.add("user4");
		v1.add("user5");

		//vector값을 불러오는 3가지 방법
		//for ~ get 거의 사용하지 않는다
		for (int i = 0; i<v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		System.out.println("================================");
		//for ~in 문 -> for each
		for(String i : v1) {
			System.out.println(i);
		}
		System.out.println("================================");
		//Iterator -> 공식
		Iterator<String> iter = v1.iterator();	//1.iterator객체 생성
		while(iter.hasNext()) {	//2.while문으로 Iterator요소 출력
			String str = (String) iter.next();
			System.out.println(str);
		}
		System.out.println("================================");
		
	}
}
