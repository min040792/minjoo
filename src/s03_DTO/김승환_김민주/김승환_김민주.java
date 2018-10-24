package s03_DTO.김승환_김민주;

public class 김승환_김민주 {
	
	private String id;
	private String pw;
	private int age;
	private int number;
	private String add;
	
	public 김승환_김민주(String id, String pw, int age, int number, String add) {
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.number = number;
		this.add = add;
	
	}	
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	//@Override
	public String toString() {
		
		return "Id :"+id+"\nPw :"+pw+"\nAge :"+age+"\nNumber :"+number+"\nAddress :"+add+"\n=====================";
	}
	
	
	
	
	
}
