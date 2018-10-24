package s03_DTO.류성곤_최재훈.slot;

import java.util.Scanner;

public class SlotEx {
	private static Slot[] SlotArray = new Slot[100];
	private static Scanner scanner = new Scanner(System.in);
	static boolean run = true;
	static boolean toRun = false;

	public static void main(String[] args) {
		// process 시작
		Loop: while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.종료  ");
			System.out.println("---------------------------------------------------");

			// 원하는 작업 선택
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				login();
			} else if (selectNo == 3) {
				run = false;
				System.out.println("프로그램 종료");
				System.exit(0);
				// admin 로그인
			} else if (selectNo == 777) {
				list();
			}
			// 로그인 중 목록
			if (toRun == true) {
				while (toRun) {
					System.out.println("---------------------------------------------------");
					System.out.println("1.입금 | 2.게임시작 | 3.로그아웃  ");
					System.out.println("---------------------------------------------------");
					int selectNo1 = scanner.nextInt();
					if (selectNo1 == 1) {
						deposit();
					} else if (selectNo1 == 2) {
						GAME();
					} else if (selectNo1 == 3) {
						System.out.println("로그아웃 되었습니다.");
						toRun = false;
						run = true;
						continue Loop;
					}
				}
			}
		}
	}

	private static void GAME() {
		System.out.println("아이디를 입력하세요");
		System.out.print("아이디 ");
		String ano = scanner.next();
		Slot account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 아이디가 없습니다.");
			return;
		} else {
			int k = (int) (Math.random() * 7 + 1);
			int k1 = (int) (Math.random() * 7 + 1);
			int k2 = (int) (Math.random() * 7 + 1);
			System.out.print("[" + k + "]" + "[" + k1 + "]" + "[" + k2 + "]");
			if (7 == k && 7 == k1 && 7 == k2) {
				System.out.println("축 당첨 만원~~~ ");
				int money = 10000;
				account.setcoin(account.getcoin() + money);
				System.out.println(account.getcoin());
			} else {
				int money = 5000;
				account.setcoin(account.getcoin() - money);
				if (account.getcoin() < 0) {
					System.out.println("꽝~~~~~~");
					System.out.println("잔액" + account.getcoin());
					if (account.getcoin() < -500) {
						System.out.println("간 담보야~");
						if (account.getcoin() < -5000) {
							System.out.println("신체야 안녕~");
							if (account.getcoin() < -10000) {
								System.out.println("산자가 아니오리다");
								System.exit(0);
							}
						}
					}
				} else {
					System.out.println("꽝~~~~~~");
					System.out.println("적당히 하셔~");
					System.out.println("잔액" + account.getcoin());

				}
			}
		}
	}

	// 입금
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("입금");
		System.out.println("--------------");
		System.out.print("아이디 ");
		String ano = scanner.next();
		System.out.print("입금액: ");
		int money = scanner.nextInt();
		Slot account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 아이디가 없습니다.");
			return;
		}
		account.setcoin(account.getcoin() + money);
		System.out.println("결과: 입금이 되었습니다.");
	}

	private static void list() {
		System.out.print("ID: ");
		String idNo = scanner.next();

		System.out.print("pw: ");
		String pw = scanner.next();
		if ("admin".equals(idNo) && "admin".equals(pw)) {
			for (int i = 0; i < SlotArray.length; i++) {
				Slot nu = SlotArray[i];
				if (nu != null) {
					System.out.println(nu);
				}

			}
		}

	}

	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("회원가입");
		System.out.println("--------------");

		System.out.print("아이디: ");
		String idNo = scanner.next();

		System.out.print("패스워드: ");
		String pw = scanner.next();

		System.out.print("이름: ");
		String name = scanner.next();

		System.out.print("코인: ");
		int coin = scanner.nextInt();

		// 입력받은 데이터로 Account 객체 생성
		Slot newAccount = new Slot(idNo, pw, name, coin);
		for (int i = 0; i < SlotArray.length; i++) {
			if (SlotArray[i] == null) {
				SlotArray[i] = newAccount;
				System.out.println("결과: 회원가입 되었습니다.");
				break;
			}
		}
	}

	private static void login() {
		System.out.println("아이디>>>");
		String idNo = scanner.next();
		System.out.println("패스워드>>>");
		String pw = scanner.next();
		for (int i = 0; i < SlotArray.length; i++) {
			if (SlotArray[i] != null) {
				if (SlotArray[i].getIdNo().equals(idNo) && SlotArray[i].getPw().equals(pw)) {
					String id = SlotArray[i].getIdNo();
					System.out.println(id + "님 환영합니다~~~~.");
					run = false;
					toRun = true;

				} else {
					System.out.println("로그인 실패");
				}
			}
		}
	}

	private static Slot findAccount(String IdNo) {
		Slot account = null;
		for (int i = 0; i < SlotArray.length; i++) {
			if (SlotArray[i] != null) {
				String dbAno = SlotArray[i].getIdNo();
				if (dbAno.equals(IdNo)) {
					account = SlotArray[i];
					break;
				}
			}
		}
		return account;
	}
}