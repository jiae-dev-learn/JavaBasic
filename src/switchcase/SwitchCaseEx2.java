/**
 * 작성자: 김지애
 * 문제: 각 월에 따른 한달 날짜 수를 day 변수 값으로 출력하시오. 단 2월은 28일로 합니다.
 */
package switchcase;

import java.util.Scanner;

public class SwitchCaseEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = 0;

		switch (month) {
		case 1: case 3: case 5:	case 7:	case 8:	case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:	case 6:	case 9:	case 11:
			day = 30;
			break;
		default:
			System.out.println("Error");
			break;
		}
		System.out.println(month + "월의 날짜는 " + day + " 입니다.");
	}
	
}
