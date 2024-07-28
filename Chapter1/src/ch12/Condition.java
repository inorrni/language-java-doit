package ch12;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {

		int max;

		System.out.println("두 수를 입력 받아서 큰 수를 출력하세요");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input1: ");
		
    int x = scanner.nextInt();
		System.out.print("input2: ");
		
    int y = scanner.nextInt();
		max = (x>y) ? x : y;

		scanner.close();

		System.out.println("--->" + max);
	}
}
