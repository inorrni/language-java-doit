package ch14;

import java.util.Scanner;

public class SwitchInt {
  public static void result(int month, int day) {
    System.out.println(month + "월은 " + day +"일까지 있습니다.");
  }
	public static void main(String[] args) {

		int month;
		int day;
		
    System.out.println("월을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		
		switch(month) {
		
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
        result(month, day);
				break;
      case 2:
				day = 28;
        result(month, day);
				break;
      case 4: case 6: case 11: 
				day = 30;
        result(month, day);
				break;
			default:
				System.out.println("해당 월은 존재하지 않습니다.");
		}
    
    scanner.close();
	}
}
