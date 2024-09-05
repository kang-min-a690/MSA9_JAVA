package 점심메뉴추천;

public class Menu {
	private String type;	//메뉴 종류 (한식,중식,일식 등)
	private String name;	//메뉴 이름
	private double price;	//가격
	private double distance;	//거리(단위 km)
	
	public Menu(String type, String name, double price, double distance) {
		this.type = type;
		this.name = name;
		this.price = price;
		this.distance = distance;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getDistance() {
		return distance;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return String.format("종류: %s\n이름: %s\n가격: %.2f\n거리: %.2f km", type, name, price, distance);
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Randdom;

public class MenuManager {
	private List<Menu> menus;
	
	public MenuManager() {
		menus = new ArrayList<>();
		//한식 메뉴 5개 추가
		menus.add(new Menu("한식", "김치찌개",8000,0.5));
	}
}


