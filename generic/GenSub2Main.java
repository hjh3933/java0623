package org.java.generic;

public class GenSub2Main {
	public static void main(String[] args) {
		
		GenSub2<String> g1 = new GenSub2<>();
		
		//¹Ú½Ì
		g1.setT(new String("root"));
		String str = g1.getT();
		
		//ÀÚµ¿ ¾ð¹Ú½Ì
		GenSub2<Integer> g2 = new GenSub2<>();
		g2.setT(11);
		int num = g2.getT();
		
		GenSub2<Character> g3 = new GenSub2<>();
		g3.setT('a');
		char ch = g3.getT();
		
		//¾ð¹Ú½Ì
		GenSub2<Float> g4 = new GenSub2<>();
		g4.setT(1.5f);
		float ff = g4.getT().floatValue();
		
		GenSub2<Long> g5 = new GenSub2<>();
		GenSub2<Short> g6 = new GenSub2<>();
		GenSub2<Double> g7 = new GenSub2<>();
		GenSub2<Boolean> g8 = new GenSub2<>();
		GenSub2<Byte> g9 = new GenSub2<>();
		
	}
	
}
