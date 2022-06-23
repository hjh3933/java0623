package org.java.generic;

import java.util.LinkedList;

public class QueueEx1 {
	public static void main(String[] args) {
		
		LinkedList<String> qu = new LinkedList<String>();
		
		qu.add("넷");
		qu.add("셋");
		qu.add("둘");
		qu.add("하나");
		
		// peek메소드를 이용한 요소의 반환
		System.out.println(qu.peek());
		System.out.println(qu);
		//poll메소드를 이용한 요소의 반환 및 제거(먼저들어온 값 제거)
		System.out.println(qu.poll());
		System.out.println(qu);
		//remove메소드를 이용한 요소의 제거(선택제거)
		qu.remove("하나");
		System.out.println(qu);
	}
}
