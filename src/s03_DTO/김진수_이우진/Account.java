package s03_DTO.김진수_이우진;
public class Account{
	
	//field
	private String ano;
	private String owner;
	private int balance;
	
	//constructor
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
//getter & setter
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
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
		this.balance = balance;
	}

	@Override
	public String toString() {
		return ano + "\t" + owner + "\t" + balance;
	}

}

