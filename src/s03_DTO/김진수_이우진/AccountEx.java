package s03_DTO.김진수_이우진;
import java.util.Scanner;

public class AccountEx {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = true;//while 문을 벗어나기위해서 선언
		while (flag) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");
			//1~5선택
			int selectNo = scanner.nextInt();

			if (selectNo == 1)
				createAccount();
			else if (selectNo == 2)
				accountList();
			else if (selectNo == 3)
				deposit();
			else if (selectNo == 4)
				withdraw();
			else if (selectNo == 5)
				flag = false;
		}
		System.out.println("프로그램 종료");
	}

	static int count = 0;
						//계좌생성 메소드
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");

		System.out.print("계좌번호: ");
		
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기 입금액: ");
		int bal = scanner.nextInt();
		accountArray[count] = new Account(ano, owner, bal);//새로운 계좌 생성
		System.out.println("결과: 계좌가 생성되었습니다.");
		count++;
	}
		//생성된 계좌 리스트확인 메소드 
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for (int i = 0; i < count; i++) {
			System.out.println(accountArray[i]);
		}
	}
		//예금 메소드
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");

		System.out.print("계좌번호: ");
		String str = scanner.next();//스캐너로 계좌받음
		Account a = findAccount(str);	
		System.out.println("예금액: ");
		int money = scanner.nextInt();//예금액 작성
		a.setBalance(a.getBalance() + money);//위에서 받은 예금액을 잔고에 넣는다
	}
		//출금 메소드
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		Account a = findAccount(ano);
		if (a == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		a.setBalance(a.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
		System.out.println("잔액:"+a.getBalance());
	}
		//계좌를 찾아주는 메소드다
	private static Account findAccount(String ano) {
		int index = 0; 
		for (int i = 0; i < count; i++) {
			String temp = accountArray[i].getAno();
			if (temp.equals(ano))
				break;
			index++;
		}
		return accountArray[index];
	}
}

