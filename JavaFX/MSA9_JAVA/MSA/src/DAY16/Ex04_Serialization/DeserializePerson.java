package DAY16.Ex04_Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DeserializePerson {
	
	public static void main(String[] args) {
		//Person.dat 파일을 역직렬화하여 객체로 입력
		
		try (
				FileInputStream fis = new FileInputStream("Person.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);		
			) {
			Person person = (Person)  ois.readObject();
				System.out.println(person);
				System.out.println("");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
