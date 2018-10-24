package s03_DTO.신영민_조현준;

//고객 생성클래스
public class Customer {

	String Cname;
	int age;
	int money;

	static Product[] pro ;
	int count = 0;

	public Customer(int x) {
		pro = new Product[x];
		count = 0;
	}

	public Customer(String name, int age, int money) {
		this.Cname = name;
		this.age = age;
		this.money = money;
	}

	String ibgo(String name, int price, int stock) {
		// 입고 시킬 상품이 있으면 재고만 추가
		for (Product k : pro) {
			if (k != null) {
				if (k.getName().equals(name) && k.getPrice() == price) {
					k.setStock(k.getStock()+stock);
					System.out.println(pro[count-1]);
		

					return "상품 재고가 입고 되었습니다";
				}
			}
		}
		// 새로운 상품을 추가
		pro[count++] = new Product(name, price, stock);
		System.out.println(pro[count-1]);
		return "새로운 상품이 입고되었습니다.";
	}
	
	static void menuList() {
		System.out.println("-------------------------");
		System.out.println(" 메 뉴 판");
		System.out.println("-------------------------");
		
		for(Product k : pro) {
			Product list = k;
			if(list != null) {
				System.out.println(list);
			}
		}
	}
	
	String culgo(String name,int price, int stock) {
		for (Product k : pro) {
			if (k != null) {
				if (k.getName().equals(name) && k.getPrice() == price) {
					if(k.getStock()<0) {
						k.setName(name);
						k.setPrice(price);
						k.setStock(stock);
					}
					k.setStock(k.getStock()-stock);
					System.out.println(pro[count-1]);
		

					return "상품 재고가 출고 되었습니다";
				}
			}
		}
		// 새로운 상품을 추가
		return "상품이 존재하지 않습니다.";
	}

	String gume(String name, int price, int Count) {
		int myCount = 0;
		for (Product k : pro) {
			if (k != null) {
				if (k.getName().equals(name) && k.getPrice() == price) {
//					int i = 0;
//					while (i < Count) {
//						myCount++;
//						i++;
//					}
					k.setStock(k.getStock()-Count);
					
					return price + "원 짜리 " + name + "을 " + myCount + "개 구매하셨습니다";
				}
			}
		}

		return "상품 입력이 잘못 되었습니다.";
	}



}
