package DAY09.EX06_통장만들기;

public class AccountTest {
	
	public static void main(String[] args) {
		Account account = new Account();
		
		//10000원 입금
		account.deposit(10000);
		
		//20000원 출금
		
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
	}

}
