package s03_DTO.한정원_진성훈.home;

import java.util.Scanner;

public class MemberApplication {

	// 100칸짜리 배열 생성및 선언
	private static Member[] memberArray = new Member[100]; // 전체목록 배열
	private static String[] loginmemberarray = new String[100]; // 접속자용 배열

	// scan 객체 생성
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// while문 벗어나기 위해 flag(run) 선언
		boolean run = true;
		// process 시작
		while (run) {
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1.계정 생성/삭제 | 2.전체/현재 접속 계정목록 | 3.로그인/로그아웃 | 4.아이디/비밀번호 찾기 | 5.검색 | 6.종료");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.print("선택> ");
			// 원하는 작업 선택
			int selectNo = sc.nextInt();

			// 선택한 작업에 맞는 메소드 실행

			switch (selectNo) {

			case 1:// 계정 생성과 삭제
				int select;
				System.out.println("1.계정 생성 // 2.계정 삭제 ");
				select = sc.nextInt();
				if (select == 1) {
					createId();
				} else if (select == 2) {
					System.out.print("ID를 입력해주세요 >>");
					String id = sc.next();
					System.out.println("비밀번호를 입력해주세요 >>");
					String pw = sc.next();
					System.out.println("2차 비밀번호를 입력해주세요 >>");
					String hack = sc.next();
					delId(id, pw, hack); // 가입은 쉽게 삭제는 2차비번으로 보안강화

				} else {
					System.out.println("잘못 입력하셨습니다. 1,2중 골라주세요.");
				}

				break;

			case 2:// 회원목록 조회
				int select1;
				System.out.println("1.전체 회원목록 // 2.현재 접속중인 아이디 목록 ");
				select1 = sc.nextInt();
				if (select1 == 1) {
					memberList();
				} else if (select1 == 2) {
					loginList();
				} else {
					System.out.println("잘못 입력하셨습니다. 1,2중 골라주세요.");
				}
				break;

			case 3:// 로그인,로그아웃
				int select11;
				System.out.println("1.로그인 // 2.로그아웃 ");
				select11 = sc.nextInt();

				if (select11 == 1) {
					System.out.print("ID를 입력해주세요 >>");
					String id = sc.next();
					System.out.println("비밀번호를 입력해주세요 >>");
					String pw = sc.next();
					login(id, pw);
					break;

				} else if (select11 == 2) {

					System.out.print("ID를 입력해주세요 >>");
					String id = sc.next();
					System.out.println("비밀번호를 입력해주세요 >>");
					String pw = sc.next();

					logout(id, pw);
					break;

				} else {
					System.out.println("잘못입력하셨습니다. 1,2중 골라주세요");

					break;
				}

			case 4:// 아이디 ,비번찾기

				int select111;
				System.out.println("1.아이디 찾기 // 2. 비밀번호찾기");
				select111 = sc.nextInt();

				if (select111 == 1) {
					System.out.println("이름을 입력해주세요 >>");
					String name = sc.next();
					System.out.println("2차 비밀번호를 입력해주세요 >>");
					String hack = sc.next();

					searchId(name, hack);

				} else if (select111 == 2) {

					System.out.println("아이디을 입력해주세요 >>");
					String id1 = sc.next();
					System.out.println("2차 비밀번호를 입력해주세요 >>");
					String hack = sc.next();

					searchPw(id1, hack);

				} else {
					System.out.println("잘못입력하셨습니다. 1,2중 골라주세요");
					break;
				}
				break;
			case 5:
				System.out.println("검색어를 입력해주세요");
				String id = sc.next();
				search(id);
				break;
			case 6:

				run = false; // flag 바꿔서 while 문 빠져나감
				System.out.println("프로그램 종료");
				break;
			}

		}
	}

//메소드모음	
//////////////////////////////////////////////////////1번//////////////////////////////////////////////////////////////////
	// 아이디 만들기
	private static void createId() {

		System.out.println("-------------------------------------------------------------");
		System.out.println("아이디 생성");
		System.out.println("-------------------------------------------------------------");

		System.out.println("아이디: ");
		// 앞에서 nextInt() 받을 때 남은 /r/n 있으므로 nextLine()으로 받으면 에러
		String id = sc.next();

		System.out.println("이름: ");
		String name = sc.next();

		System.out.println("비밀번호: ");
		String password = sc.next();

		System.out.println("나이: ");
		int age = sc.nextInt();

		System.out.println("주소: ");
		String address = sc.next();

		System.out.println("아이디 및 비밀번호를 찾을때 사용할 2차 비밀번호를 적으세요: ");
		String hack = sc.next();

		// 입력받은 데이터로 Member객체 생성
		Member newMember = new Member(id, name, password, age, address, hack);
		// 계좌 저장한 배열(memberArray)에서 빈 칸(null)을 찾아 생성된 회원정보를 저장
		for (int i = 0; i < memberArray.length; i++) {

			if (memberArray[i] != null) {

				if (memberArray[i].getId().equals(newMember.getId())) {
					System.out.println("이미 사용된 아이디입니다 다른아이디를 적어주세요.");
					break;
				}

			} else {

				memberArray[i] = newMember;
				System.out.println("회원 가입이 완료되었습니다.");
				break;
			}
		}
	}

	// 계정 삭제
	private static void delId(String id, String pw, String hack) {

		// 확장for문은 중간의 값을 빼기가 어렵다//

		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] != null) {
				if (memberArray[i].getId().equals(id) && memberArray[i].getPassword().equals(pw)
						&& memberArray[i].getHack().equals(hack)) {

					System.out.printf("아이디 : %s 이(가) 삭제되었습니다.\n", id);
					memberArray[i] = null;

					break;
				}

			} else {
				System.out.println("아이디나 비밀번호가 틀렸습니다.");
				break;

			}
		}

	}

//////////////////////////////////////////////////////2번//////////////////////////////////////////////////////////////////
	// 전체 회원목록보기 메소드
	private static void memberList() {
		System.out.println("-------------------------------------");
		System.out.println("전체 계정목록");
		System.out.println("-------------------------------------");
		for (int i = 0; i < memberArray.length; i++) {
			Member member = memberArray[i];

			if (member != null) {

				System.out.println(member);
			}
		}
	}

	// 접속중인 회원목록보기 메소드
	private static void loginList() {

		System.out.println("-----------------------------------------");
		System.out.println("접속중인 계정목록");
		System.out.println("-----------------------------------------");

		for (int i = 0; i < loginmemberarray.length; i++) {
			if (loginmemberarray[i] != null) {

				System.out.println(loginmemberarray[i]);
			}

		}
	}

	////////////////////////////////////////////////////// 3번//////////////////////////////////////////////////////////////////
	// 로그인
	private static void login(String id, String pw) {
		// Member newMember = new Member(id, pw);
		for (Member k : memberArray) {
			if (k != null) {
				if (k.getId().equals(id) && k.getPassword().equals(pw)) {
					System.out.println("로그인 되었습니다.");
					for (int i = 0; i < loginmemberarray.length; i++) {
						if (loginmemberarray[i] == null) {
							// System.out.println(k.getId());
							loginmemberarray[i] = k.getName();
							break;
						}
					}

				} else {
					System.out.println("아이디나 비밀번호가 틀렸습니다.");
					break;
				}
			}
		}

		System.out.println("등록된 아이디가 없습니다");
	}

	// 로그아웃
	private static void logout(String id, String pw) {

		for (Member k : memberArray) {
			if (k != null) {
				if (k.getId().equals(id) && k.getPassword().equals(pw)) {

					for (int i = 0; i < loginmemberarray.length; i++) {
						if (loginmemberarray[i] != null) {
							if (loginmemberarray[i].equals(k.getId())) {
								loginmemberarray[i] = null;
								System.out.println("로그아웃 되었습니다.");
								break;
							}
						}
					}
				} else {
					System.out.println("아이디나 비밀번호가 틀렸습니다.");
					break;
				}
			} else {
				System.out.println("등록된 아이디가 없습니다.");
				break;
			}

		}

	}

//////////////////////////////////////////////////////4번//////////////////////////////////////////////////////////////////
	// 아이디찾기
	private static void searchId(String name, String hack) {

		for (Member k : memberArray) {
			if (k != null) {
				if (k.getName().equals(name) && k.getHack().equals(hack)) {
					System.out.printf("당신의 ID는  %s 입니다\n", k.getId());
					break;
				} else {
					System.out.println("이름과 2차 비밀번호가 다릅니다.");

					break;
				}
			}
		}

	}

	// 비번찾기
	private static void searchPw(String id, String hack) {

		for (Member k : memberArray) {
			if (k != null) {
				if (k.getId().equals(id) && k.getHack().equals(hack)) {
					System.out.printf("당신의 비밀번호는 %s 입니다\n", k.getPassword());
					break;
				} else {
					System.out.println("이름과 2차 비밀번호가 다릅니다.");

					break;
				}
			}
		}
	}

//검색기능
	private static void search(String tmp) {

		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] != null) {
				if (memberArray[i].getId().equals(tmp)) {

					System.out.println(memberArray[i]);

				} else if (memberArray[i].getName().equals(tmp)) {
					System.out.println(memberArray[i]);
				} else if (memberArray[i].getAge() == Integer.parseInt(tmp)) {
					System.out.println(memberArray[i]);
				} else if (memberArray[i].getAddress().equals(tmp)) {
					System.out.println(memberArray[i]);
				} else {
					System.out.println("키워드에 맞는 검색 결과가  없습니다.");
				}
				break;
			} else {
				System.out.println("아무 계정도 등록되어있지 않습니다.");
				break;

			}
		}

	}
}
