package DAY08.디자인패턴2.Builder;

public class Builder {

	public static void main(String[] args) {
		//new Pikachu(100,"전기");
		//new Pikachu(1,"전기");
		//이렇게 써야하는걸 아래처럼 요약할수 있는게 빌더.
		Pikachu pikachu =new Pikachu.Builder()
									.energy(100)
									.type("전기")
									.level(10)
									.build();
		
		System.out.println(pikachu);
	}
}
