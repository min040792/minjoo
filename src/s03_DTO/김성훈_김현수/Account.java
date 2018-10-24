package s03_DTO.김성훈_김현수;

//DTO
public class Account {
	
	/*field*/
	private String accountNo;
	private String owner;
	private String pwd;
	private int balance;
	
	/*constructor*/
	public Account(String accountNo, String owner, String pwd, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.pwd = pwd;
		this.balance = balance;
	}
	
	/*method(getter and setter)*/
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance += balance;
	}
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "\t====" + this.getOwner() + "님의 계좌정보====" + "\n\t계좌번호 : " + this.accountNo + "\n\t잔액 : " + this.balance;
//		return "\t계좌번호 : " + this.accountNo + "\n\t예금주 : " + this.owner + "\n\t잔액 : " + this.balance;
	}
	
}

