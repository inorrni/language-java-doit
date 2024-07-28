package ch15;

import java.util.Scanner;

public class DoWhile {

  	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
    System.out.println("더하고자 하는 숫자를 입력하세요. 0을 입력하면 종료됩니다.");
		do {
			System.out.print("num: ");
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);

		scanner.close();
    
    System.out.println("총합: " + sum);

	}

}
