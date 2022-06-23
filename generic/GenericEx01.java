package org.java.generic;

class Gen1 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}

class Gen2 {
	private String num;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}

class Gen3<T> {
	//T: type의 약자(아직 정하지 않았음)
	private T num;

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

}

public class GenericEx01 {
	public static void main(String[] args) {
		Gen1 g1 = new Gen1();
		g1.setNum(10);
		g1.getNum();
		
		Gen2 g2 = new Gen2();
		g2.setNum("manso01");
		g2.getNum();
		
		//type을 객체 생성시에 설정할 수 있다
		//int같은 기본 타입은 불가능 Integer사용
		Gen3<Integer> g3 = new Gen3<>();
		g3.setNum(10);
		g3.getNum();
		
		Gen3<String> g4 = new Gen3<>();
		g4.setNum("manso01");
		g4.getNum();
		
		//타입비교
		if (g3.getNum() instanceof Integer) {
			System.out.println("Integer");
		}
		if (g4.getNum() instanceof String) {
			System.out.println("String");
		}
		
		
		
		
	}
}
