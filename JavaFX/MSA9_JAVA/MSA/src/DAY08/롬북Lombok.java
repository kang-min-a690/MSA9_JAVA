package DAY08;

public class 롬북Lombok {
	
	//@어노테이션
	//@NoArgsConstructor				: 기본 생성자
	//@AllArgsConstuctor				: 모든 매개변수 생성자
	//@RequiredArgsConstructor			: final 및 @NonNull 붙인 변수들을 포함하는 필수 생성자
	//@Nonnull							: null이 들어오지못하도록 지정
	//@Getter							: getter
	//@Setter							: setter
	//@ToString						: toString
	
	//@Data							: @Getter, @Setter, @ToString
	//								  @RequiredArgsConstructor
	//								  @EqualsHashCode
	
	//@Data
	public class Person11 {
		
		private String name;
		private int aga;
		private double height;
		private double weight;
		
	}
}

