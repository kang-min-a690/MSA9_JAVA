package DAY07.EX04_중첩인터페이스;

public class K implements I.J {

	@Override
	public void methodA() {
		System.out.println("중첩 인터 페이스 - methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("중첩 인터 페이스 - methodB()");
		
	}

}
