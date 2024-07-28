package ch16;

public class MultiplicationTablesWhile {

  public static void main(String[] args) {
    int firstNum = 2;
    int lastNum = 1;

    while(firstNum <= 9) {
      System.out.println("-----------------");
      System.out.println(firstNum + "단");
      System.out.println("-----------------");
      
      lastNum = 1;
      while(lastNum <= 9) {
        System.out.println(firstNum + " x " + lastNum + " = " + firstNum * lastNum);
        lastNum++;
      }
      firstNum++;
    }
  }
}
