package sub05;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.printf("%d는 윤년 입니다.\n", year);
        }else{
        	System.out.printf("%d는 평년 입니다.\n", year);
        }

		GregorianCalendar greCal = new GregorianCalendar();
		
        if (greCal.isLeapYear(year))
        {
        	System.out.printf("%d는 윤년 입니다.\n", year);
        }
        else
        {
        	System.out.printf("%d는 평년 입니다.\n", year);
        }
		
		
	}
}
