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

		// for�� vector.get(i).getuserId()
		System.out.println("for��");
		for (int i = 0; i < member.size(); i++) {
			System.out.println("���̵�: " + member.get(i).getUserId() + ", ��й�ȣ: " + member.get(i).getUserPw() + ", ����: "
					+ member.get(i).getUserAge() + ", ��ȭ��ȣ: " + member.get(i).getUserPhone());
		}

		System.out.println("=====================================================");

		// for each�� i.getUserId();
		// ���̵�: , ��й�ȣ: , ����: , ��ȭ��ȣ
		System.out.println("for-each��");
		for (MemberDto i : member) {
			System.out.println("���̵�: " + i.getUserId() + ", ��й�ȣ: " + i.getUserPw() + ", ����: " + i.getUserAge()
					+ ", ��ȭ��ȣ: " + i.getUserPhone());
		}

		System.out.println("=====================================================");

		// Iterator Ÿ�� ������ = (Ÿ��) iterator����.next(); -> ������.getUserId();
		System.out.println("Iterator");
		Iterator<MemberDto> iter = member.iterator();
		while (iter.hasNext()) {
			MemberDto str = (MemberDto) iter.next();
			System.out.println("���̵�: " + str.getUserId() + ", ��й�ȣ: " + str.getUserPw() + ", ����: " + str.getUserAge()
					+ ",��ȭ��ȣ: " + str.getUserPhone());
		}

		System.out.println("=====================================================");
		// Scanner�� while if~else if -> insertȸ���߰� exit����
		Vector<MemberDto> student = new Vector<>();

		Scanner scn = new Scanner(System.in);
		System.out.println("insert: ȸ���߰�, exit ����");
		String query = scn.next();

		while (true) {
			if (query.equals("insert")) {
				System.out.println("���̵� �Է�");
				String userId = scn.next();
				System.out.println("��й�ȣ �Է�");
				String userPw = scn.next();
				System.out.println("���� �Է�");
				int userAge = scn.nextInt();
				System.out.println("��ȭ��ȣ �Է�");
				String userPhone = scn.next();
				student.add(new MemberDto(userId, userPw, userAge, userPhone));
			} else if (query.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			}
			
			System.out.println("�߰��� �л� ���");
			for (MemberDto dto : student) {
				System.out.println("���̵� : "+dto.getUserId()+", ��й�ȣ : "+dto.getUserPw()+", ���� : "+dto.getUserAge()+", ��ȭ��ȣ : "+dto.getUserPhone());
			}

		}

	}
}
