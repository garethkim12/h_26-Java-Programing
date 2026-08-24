package account;

public class AccountMemDao {
	public static int noSeq = 111111; 
	private Account[] accountDB = new Account[100]; // account 객체를 100 개 만들 수 있는 객체
	private int numAccount;
	
	// 계좌등록
	public boolean insertAccount(String owner, String password, int balance) {
		if (numAccount >= accountDB.length) {
			return false; // 배열이 꽉 찬 경우
		}
		int no = noSeq++; 
		accountDB[numAccount++] = new Account(no, owner, password, balance);
		return true;
	}
	
	// 계좌조회 (계좌리스트를 return)
	public Account[] selectAll() {
		Account[] accountList = new Account[numAccount];
		for (int i = 0; i < numAccount; i++)
			accountList[i] = accountDB[i];
		return accountList;
	}
		
	// 입금
	public boolean deposit(int accountNo, int amount) {
		for (int i = 0; i < numAccount; i++) {
			if (accountNo == accountDB[i].getNo()) {
				if (amount <= 0) return false; // 0원 이하 입금 방지
				int currentBalance = accountDB[i].getBalance();
				accountDB[i].setBalance(currentBalance + amount);
				return true;
			}
		}
		return false; // 일치하는 계좌가 없는 경우
	}
	
	// 출금 (계좌번호, 출금액, 비밀번호 확인)
	public boolean withdraw(int accountNo, int amount, String password) {
		for (int i = 0; i < numAccount; i++) {
			if (accountNo == accountDB[i].getNo()) {
				// 비밀번호 검증
				if (!accountDB[i].getPassword().equals(password)) {
					return false; 
				}
				// 잔액 부족 검증
				if (accountDB[i].getBalance() < amount || amount <= 0) { //or 연산자로 예상 문제 검출 
					return false; 
				}
				
				int currentBalance = accountDB[i].getBalance();
				accountDB[i].setBalance(currentBalance - amount);
				return true;
			}
		}
		return false; // 일치하는 계좌가 없는 경우
	}
}