package DAY09.EX07_Review.추상클래스컴푸터만들기;

public class User {
	
	public static void main(String[] args) {
		Computer computer = new Desktop();
		// Computer computer2 = new Laptop();
		// 추상클래스는 객체로 생성할 수 없다.
		
		
		Computer computer2 = new Macbook();
		Laptop laptop = new Macbook();
		Macbook macbook = new Macbook();
		//Desktop desktop = new Macbook();
		// Macbook은 decktop 클래스와 부모/자식 관계가 아니기 떼믄에 업캐스팅 불가
		
		computer.on();
		computer.display();
		computer.typing();
		computer.off();
		System.out.println();
		
		computer2.on();
		computer2.display();
		computer2.typing();
		computer2.off();
		System.out.println();
		
		laptop.on();
		laptop.display();
		laptop.typing();
		laptop.off();
		System.out.println();
		
		macbook.on();
		macbook.display();
		macbook.typing();
		macbook.off();
		System.out.println();
		
	}

}
