package s03_DTO.신영민_조현준;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {

		Customer C1 = new Customer(100) ; //상품의 해당하는 배열
		
//		Customer p1 = new Customer("신영민", 24, 100000);
//		Customer p2 = new Customer("서동민", 25, 215000);
//		int balance = 50000;
		while (true) {

			System.out.println("-------------------------------");
			System.out.println("   1.가게 관리 | 2.재고 관리 | 3.종료 ");
			System.out.println("-------------------------------");
			Scanner sc = new Scanner(System.in);

			int select = Integer.parseInt(sc.nextLine());

			String Cname,name;
			int price , stock;
			switch (select) {

			case 1:
				System.out.println("매장관리를 시작합니다.");

				while (true) {
					System.out.println("-------------------------------");
					System.out.println(" 1.손님 받기 | 2.물건 사기 | 3.매장 문닫기");
					System.out.println("-------------------------------");
					select = Integer.parseInt(sc.nextLine());
					switch (select) {
					case 1:
						System.out.println("매장에 들어오려면 성함을 말씀해 주세요");
						Cname = sc.nextLine();
						System.out.println(Cname + "님 어서오세요");
						break;
					case 2:
						System.out.println("주문하려는 메뉴를 선택해 주세요");
						C1.menuList();

						int menu = sc.nextInt();
//						C1.gume(name, price, Count);
						break;
					case 3:
						System.exit(0);
						break;
					default:
						System.out.println("커맨드를 잘못 입력 하셨습니다. \n다시 입력해 주세요.");
					}
				}
			case 2:
				System.out.println("매장의 재고 관리를 시작 합니다.");
				boolean run = true;
				while (run) {
					System.out.println("---------------------");
					System.out.println(" 1.상품 입고 | 2.상품 출고");
					System.out.println("---------------------");
					System.out.println(" 재고관리를 벗어나려면 다른 숫자를 눌러주세요.");
					select = Integer.parseInt(sc.nextLine());
					switch (select) {
					case 1:
						System.out.println("상품 입고 관리에 들어 오셨습니다.");
						System.out.print("\n입고 하실 상품명을 입력해 주세요>>");
						name = sc.nextLine();
						System.out.print("\n입고 하실 상품의 가격 입력해 주세요>>");
						price = Integer.parseInt(sc.nextLine());
						System.out.print("\n입고 하실 상품의 재고를 입력해 주세요>>");
						stock = Integer.parseInt(sc.nextLine());
						C1.ibgo(name, price, stock);
						break;
					case 2:
						System.out.println("상품 출고 관리에 들어 오셨습니다.");
						System.out.print("출고하실 상품명을 입력 해주세요>> ");
						name = sc.nextLine();
						System.out.print("\n출고하실 상품의 가격을 입력 해주세요>> ");
						price =Integer.parseInt(sc.nextLine());
						System.out.print("\n출고하실 상품의 재고를 입력 해주세요>> ");
						stock = Integer.parseInt(sc.nextLine());
						C1.culgo(name, price, stock);
						break;
						default:
							run = false;
							System.out.println("제고관리를 종료합니다.");
							break;
					}
				}

			case 3:
				System.out.println("프로그램을 종료 합니다.");
			default:

			}
		}
	}
}
