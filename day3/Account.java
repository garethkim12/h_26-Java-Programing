package account;

public class Account {
	private int no;
	private String owner;
	private String password;
	private int balance;
	
	Account(int no, String owner, String password, int balance){
		this.no = no;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	
	public int getNo() {
		return no;
	}
	public String getOwner() {
		return owner;
	}
	public String getPassword() {
		return password;
	}
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "계좌번호: " + no + " | 예금주: " + owner + " | 잔액: " + balance + "원";
	}
}