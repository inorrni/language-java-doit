package ch16;

public class MultiplicationTablesFor {

  public static void main(String[] args) {
    for (int firstNum = 2; firstNum <= 9; firstNum++) {
      System.out.println("-----------------");
      System.out.println(firstNum + "단");
      System.out.println("-----------------");

      for (int lastNum = 1; lastNum <= 9; lastNum++) {
        System.out.println(firstNum + " x " + lastNum + " = " + firstNum * lastNum);
      }
    }
  }
}
