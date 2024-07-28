package ch14;

import java.util.Scanner;

public class SwitchString {
	public static void main(String[] args) {
		String medal = "";

    System.out.println("Gold / Silver / Bronze 중에 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		medal = scanner.nextLine();
		
		switch(medal) {
		
			case "Gold":
				System.out.println("금메달 입니다.");
				break;
			case "Silver":
				System.out.println("은메달 입니다.");
				break;
			case "Bronze":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
		}
    scanner.close();

	}
}
