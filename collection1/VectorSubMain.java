package org.java.collection1;

import java.util.Vector;

public class VectorSubMain {

	public static void main(String[] args) {

		Vector<Integer> v0 = new Vector<Integer>();
		v0.add(new Integer(10)); // int값 10을 박싱하여 객체로 넣다

		Vector<VectorSub> v1 = new Vector<VectorSub>();

		v1.add(new VectorSub());
		v1.add(new VectorSub());
		v1.add(new VectorSub());
		v1.add(new VectorSub());
		v1.add(new VectorSub()); // VectorSub클래스객체를 5개 넣은걸로??

		System.out.println("size : " + v1.size());
		System.out.println("get : " + v1.get(0));
		System.out.println("================================");

		for (int i = 0; i < v1.size(); i++) {
			v1.get(i).num1 = i;
			v1.get(i).num2 = i;
			v1.get(i).setName("user" + i);
			//값을 벡터의 0번지 부터 할당하는 중
		}
		
		System.out.println(v1.get(0).num1 + v1.get(0).num2);
		System.out.println(v1.get(0).getName());
		System.out.println("================================");
		
		for (VectorSub i : v1) {
			//vector v1의 요소들을 출력하는 for each문
			System.out.println(i.num1+" "+i.num2+" "+i.getName());
		}

	}

}
