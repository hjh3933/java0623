package org.java.generic;

import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();

		// puch() 메소드를 이용한 요소의 저장 -> 마지막 요소 다음에 추가
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);

		// peek() 메소드를 이용한 요소의 반환 (그대로)
		System.out.println(st.peek());
		System.out.println(st);

		// pop() 메소드를 이용한 요소의 변환 및 제거 -> 마지막요소 삭제
		System.out.println(st.pop());
		System.out.println(st);

		// search()메소드를 이용한 요소의 위치 검색
		System.out.println(st.search(5));
		System.out.println(st.search(4));
		System.out.println(st.search(3));
		System.out.println(st.search(2));
		System.out.println(st.search(1));

		System.out.println("==================================");

		Stack<String> stack = new Stack<String>();

		// 가장 처음부터 추가
		stack.push("root1");
		stack.push("root2");
		stack.push("root3");
		stack.push("root4");
		stack.push("root5");
		System.out.println(stack);
		// top
		System.out.println(stack.peek());
		System.out.println(stack);
		// pop
		System.out.println(stack.pop());
		System.out.println(stack);
		// search
		System.out.println(stack.search("root5")); // 위에서 삭제해서 없는 값이라 - 출력
		System.out.println(stack.search("root1"));
		System.out.println(stack.search("root2"));
		System.out.println(stack.search("root3"));

	}
}
