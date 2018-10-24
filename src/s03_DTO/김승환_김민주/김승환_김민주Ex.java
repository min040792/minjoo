package s03_DTO.김승환_김민주;

import java.util.Scanner;

public class 김승환_김민주Ex {
	private static 김승환_김민주[] mb = new 김승환_김민주[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.회원가입|2.신상정보|3.비번수정|4.회원탈퇴|5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				membership();
			} else if (selectNo == 2) {
				person();
			} else if (selectNo == 3) {
				modify();
			} else if (selectNo == 4) {
				withdraw();
				run = false; // NullPointerException 방지
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void membership() {
		System.out.println("---------");
		System.out.println("회원가입");
		System.out.println("---------");

		System.out.print("Id: ");
		String id = sc.next();

		System.out.print("Password: ");
		String pw = sc.next();

		System.out.print("Age: ");
		int age = sc.nextInt();

		System.out.print("number: ");
		int number = sc.nextInt();

		System.out.print("Address");
		String add = sc.next();

		김승환_김민주 newMember = new 김승환_김민주(id, pw, age, number, add);
		for (int i = 0; i < mb.length; i++) {
			if (mb[i] == null) {
				mb[i] = newMember;
				System.out.println("가입 성공");
				break;
			}
		}

	}

	private static void person() {
		System.out.println("---------");
		System.out.println("신상정보");
		System.out.println("---------");
		System.out.println("아이디를 입력하시오");
		String id = sc.next();
		김승환_김민주 member = findMember(id);
		if (member != null) {
			System.out.println(member);
		} else {
			System.out.println("회원이 아닙니다");
			return;
		}
	}

	private static void modify() {
		System.out.println("---------");
		System.out.println("비번수정");
		System.out.println("---------");
		System.out.println("Id입력하세요: ");
		String id = sc.next();

		김승환_김민주 member = findMember(id);

		if (member == null) {
			System.out.println("회원이 아닙니다");
			return;
		} else {
			System.out.println("변경할 비번입력하세요: ");
			String pw = sc.next();
			member.setPw(pw);
			System.out.println("수정이 완료 되었습니다");
		}

	}

	private static void withdraw() {
		System.out.println("---------");
		System.out.println("회원탈퇴");
		System.out.println("---------");
		System.out.println("Id입력하세요: ");
		String id = sc.next();

		김승환_김민주 member = findMember(id);

		if (member == null) {
			System.out.println("회원이 아닙니다\n보안을 위해 강제 종료 합니다");
			return;
		} else {
			System.out.println("Pw를 입력하시면 탈퇴처리 됩니다\nPw를 입력하세요: \n");
		}

		String pw = sc.next();
		if (member.getPw().equals(pw)) {
			member = null;
		} else {
			System.out.println("Pw가 일치하지 않습니다\n보안을 위해 강제 종료 합니다");
		}
//		for (int i = 0; i < mb.length; i++) {
//			if (mb[i] != null) {
//				String dbAno = mb[i].getPw();
//				if (dbAno.equals(pw)) {
//					member.setId(null);
//					member.setPw(null);
//					member.setAge(0);
//					member.setNumber(0);
//					member.setAdd(null);
//					System.out.println("탈퇴처리가 완료 되었습니다\n프로그램을 종료합니다");
//				} else {
//					System.out.println("Pw가 일치하지 않습니다\n보안을 위해 강제 종료 합니다");
//				}
//			}
//		}
	}

	private static 김승환_김민주 findMember(String id) {
		김승환_김민주 member = null;
		for (int i = 0; i < mb.length; i++) {
			if (mb[i] != null) {
				String dbAno = mb[i].getId();
				if (dbAno.equals(id)) {
					member = mb[i];
					break;
				}
			}
		}
		return member;

	}

}
