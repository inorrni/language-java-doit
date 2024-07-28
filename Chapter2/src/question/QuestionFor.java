package question;

public class QuestionFor {
  /*
   * 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
   */
  public static void main(String[] args) {
    int firstNum = 2;
    int lastNum = 1;

    for (firstNum = 2; firstNum <= 9; firstNum++) {
      System.out.println("-----------------");
      System.out.println(firstNum + "단");
      System.out.println("-----------------");

      for (lastNum = 1; lastNum <= firstNum; lastNum++) {
        System.out.println(firstNum + " x " + lastNum + " = " + firstNum * lastNum);
      }
    }
  }
}
