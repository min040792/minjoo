package s03_DTO.한정원_진성훈.home;

public class Member {

	//fields
	private String name;
	private String hack;
	private String id;
	private int age;
	private String address;
	private String password;
	
	//constructor

	//일반 회원정보 6개변수
	public Member(String  id, String name, String password, int age, String address  ,String hack) {
		
		this.name = name;
		this.hack = hack;
		this.id = id;
		this.age = age;
		this.address = address;
		this.password = password;
	}
	
	//아이디 비번확인용 생성자 2개변수
	public Member(String id, String pw) {
		this.id=id;
		this.password=password;
		
	}
	
	//보안이강화된 2차비번 확인용 생성자 3개변수
	public Member(String id, String password,String hack) {
		this.hack = hack;
		this.id = id;
		this.password = password;
	}

	//getters & setters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHack() {
		return hack;
	}
	public void setHack(String hack) {
		this.hack = hack;
	}
	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}





	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String toString() {
		return "아이디 : " + this.id + "\t이름 : " + this.name+"\t나이 : "+this.age+"\t주소 : "+this.address ;
		
	}
}