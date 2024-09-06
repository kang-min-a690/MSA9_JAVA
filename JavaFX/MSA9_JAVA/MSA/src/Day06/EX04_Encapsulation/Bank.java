package Day06.EX04_Encapsulation;

public class Bank {
	
	public static void main(String[] args) {
		Account account = new Account(0,"김조은","12345-05-89101","국민은행");
			
				// deposit 변수는 private으로 지정했기 때문에 접근불가
				//account.seposit= 10000;
				account.setDeposit(10000);
			//값을 직접 접근하게되면 유효하지않은 값을 임의로 지정할수도 있지만,
		//캡슐화하여 값을 setter 메소드를 통해서 접근하게되면
		//값에대한 유효성 검사와 제약조건을 지정할수있다.
		
				int money = account.getDeposit();
				System.out.println("예금액 : " + money);
				System.out.println(account);
	}
}
