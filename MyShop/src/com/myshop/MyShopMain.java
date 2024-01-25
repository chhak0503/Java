package com.myshop;

import java.util.Scanner;

import com.myshop.dao.CustomerDAO;
import com.myshop.dao.OrderDAO;
import com.myshop.dao.ProductDAO;
import com.myshop.dto.CustomerDTO;

/**
 * 날짜 : 2024/01/25
 * 이름 : 김철학
 * 내용 : JAVA Shop 미니 프로젝트 실습하기
 */
public class MyShopMain {
	public static void main(String[] args) {
		
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO    orderDAO    = OrderDAO.getInstance();
		ProductDAO  productDAO  = ProductDAO.getInstance();
		
		CustomerDTO loginedCustomer = null;
		
		while(true) {
			
			if(loginedCustomer == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");
			}else {
				System.out.println("종료:0, 로그아웃:1, 주문현황:2, 상품목록:3, 주문하기:4");	
			}
			
			
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				// 로그인
				System.out.print("아이디 입력 : ");
				String custId = sc.next();
				
				loginedCustomer = customerDAO.selectCustomer(custId);
				
				if(loginedCustomer != null) {
					System.out.println(loginedCustomer.getName() + "님 어서오세요.");
				}else {
					System.out.println(custId + "와 일치하는 회원이 없습니다.");
				}
			}
			
		}
		System.out.println("안녕히 가십시요.");
	}
}










