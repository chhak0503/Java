package test4;

import java.util.Scanner;

enum Menu {
	
	ESP("에스프레소", 3000),
	AMC("아메리카노", 3500),
    LAT("카페라떼", 4000),    
    CAP("카푸치노", 4500);
	
    private String name;
    private int price;
    
    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
}

public class Test09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------  메뉴 목록 -------- ");
		
		for (Menu menu : Menu.values()) {
			System.out.print(menu.ordinal() + ") ");
			System.out.println(menu + ", " + menu.getName() + ", " + menu.getPrice() + "원");
		}
		
		System.out.println();
		System.out.print("메뉴입력(숫자입력) : ");

		int num = sc.nextInt();
		Menu[] menus = Menu.values();
		
		System.out.println();
		System.out.println("-------- 선택 결과 -------- ");
		System.out.println("메뉴 코드 : " + menus[num]);
		System.out.println("음료 이름 : " + menus[num].getName());
		System.out.println("가격 : " + menus[num].getPrice() + "원");
	}
}