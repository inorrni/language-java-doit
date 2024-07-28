package ch14;

import java.util.Scanner;

public class SwitchVer14 {
  public static void result(int month, int day) {
    System.out.println(month + "월은 " + day +"일까지 있습니다.");
  }
	public static void main(String[] args) {

		int month;
		
    System.out.println("월을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 -> {
				yield 31;
			}
			case 2 -> { 
				yield 28;
			}
			case 4, 6, 11 -> {
				yield 30;
			}
			
			default -> {
				System.out.println("error");
				yield 0;
			}
		};
		scanner.close();
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
	}
}
