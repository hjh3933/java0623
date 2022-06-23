package org.java.collection1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {

		Vector<MemberDto> member = new Vector<>();

		member.add(new MemberDto("root1", "1111", 21, "010-1111-1111"));
		member.add(new MemberDto("root2", "1111", 22, "010-1111-2222"));
		member.add(new MemberDto("root3", "1111", 23, "010-1111-3333"));
		member.add(new MemberDto("root4", "1111", 24, "010-1111-4444"));
		member.add(new MemberDto("root5", "1111", 25, "010-1111-5555"));

		// for문 vector.get(i).getuserId()
		System.out.println("for문");
		for (int i = 0; i < member.size(); i++) {
			System.out.println("아이디: " + member.get(i).getUserId() + ", 비밀번호: " + member.get(i).getUserPw() + ", 나이: "
					+ member.get(i).getUserAge() + ", 전화번호: " + member.get(i).getUserPhone());
		}

		System.out.println("=====================================================");

		// for each문 i.getUserId();
		// 아이디: , 비밀번호: , 나이: , 전화번호
		System.out.println("for-each문");
		for (MemberDto i : member) {
			System.out.println("아이디: " + i.getUserId() + ", 비밀번호: " + i.getUserPw() + ", 나이: " + i.getUserAge()
					+ ", 전화번호: " + i.getUserPhone());
		}

		System.out.println("=====================================================");

		// Iterator 타입 변수명 = (타입) iterator변수.next(); -> 변수명.getUserId();
		System.out.println("Iterator");
		Iterator<MemberDto> iter = member.iterator();
		while (iter.hasNext()) {
			MemberDto str = (MemberDto) iter.next();
			System.out.println("아이디: " + str.getUserId() + ", 비밀번호: " + str.getUserPw() + ", 나이: " + str.getUserAge()
					+ ",전화번호: " + str.getUserPhone());
		}

		System.out.println("=====================================================");
		// Scanner로 while if~else if -> insert회원추가 exit종료
		Vector<MemberDto> student = new Vector<>();

		Scanner scn = new Scanner(System.in);
		System.out.println("insert: 회원추가, exit 종료");
		String query = scn.next();

		while (true) {
			if (query.equals("insert")) {
				System.out.println("아이디 입력");
				String userId = scn.next();
				System.out.println("비밀번호 입력");
				String userPw = scn.next();
				System.out.println("나이 입력");
				int userAge = scn.nextInt();
				System.out.println("전화번호 입력");
				String userPhone = scn.next();
				student.add(new MemberDto(userId, userPw, userAge, userPhone));
			} else if (query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
			
			System.out.println("추가된 학생 목록");
			for (MemberDto dto : student) {
				System.out.println("아이디 : "+dto.getUserId()+", 비밀번호 : "+dto.getUserPw()+", 나이 : "+dto.getUserAge()+", 전화번호 : "+dto.getUserPhone());
			}

		}

	}
}
