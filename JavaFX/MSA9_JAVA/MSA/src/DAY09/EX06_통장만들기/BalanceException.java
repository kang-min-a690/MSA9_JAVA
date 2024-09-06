package DAY09.EX06_통장만들기;

/**
 * 사용자 정의 예외 클래스
 * - pubilc class ?? Exception extends Exception
 */

public class BalanceException extends Exception{

	public BalanceException() {
		super();
	}

	public BalanceException(String message) {
		super(message);
	}
	
	

}
