package ch10;

public class Operator {
  public static void main(String[] args) {
    
    int total = 10;
		int add = 20;
		
		total += add;
		System.out.println(total);
		
		int gameScore = 100;
		int myScore;
		
		myScore = ++gameScore;
		System.out.println(myScore + "," + gameScore);
    // 101, 101
		
		myScore = gameScore++;
		System.out.println(myScore + "," + gameScore);
    // 101, 102

  }
}
