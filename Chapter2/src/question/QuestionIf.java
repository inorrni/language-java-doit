package question;

import java.util.Scanner;

public class QuestionIf {
  /* 
   * 다음 조건식을 조건문(if문)으로 바꾸어 보세요.
   * grade = (score >= 90) ? 'A' : 'B';
  */
  public static void main(String[] args) {
    int score = 0;
    String grade = "";
    
    System.out.print("점수를 입력하세요: ");
    Scanner scanner = new Scanner(System.in);
    score = scanner.nextInt();

    if (score < 90 && score >= 0) {
      grade = "B";
      System.out.println("점수는 " + grade + " 입니다.");
    } else if (score >= 90 && score <= 100) {
      grade = "A";
      System.out.println("점수는 " + grade + " 입니다.");
    } else {
      System.out.println("다시 입력하세요. 점수의 범위는 0~100 입니다.");
    }

    scanner.close();
  }
}
