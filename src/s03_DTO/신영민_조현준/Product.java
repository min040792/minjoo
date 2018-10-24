package s03_DTO.신영민_조현준;
//상품 생성 클래스
public class Product {

	String name;
	int price;
	int stock;
	
//	private Customer gesan;
//	public Product() {
//		gesan = new Customer(100000);
//		System.out.println(gesan.sub(1000));
//	}
//	
//	public Product(int price, int stock) {
//		this.price = price;
//		this.stock = stock;
//	}
//	
	
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	@Override //다형성
	public String toString() {
		return "name: " + this.getName()+"\nprice: "+this.getPrice() + "\nstock: "+ this.getStock();
	}
}
