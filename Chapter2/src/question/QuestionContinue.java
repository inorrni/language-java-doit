package question;

public class QuestionContinue {
  /*
  * 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요.
  * (continue문 사용)
  */

	public static void main(String[] args) {

		int firstNum = 2;
		int lastNum = 1;
		
		for(firstNum=2; firstNum<=9; firstNum++){

			if (firstNum%2 != 0) continue;
      System.out.println("-----------------");
      System.out.println(firstNum + "단");
      System.out.println("-----------------");
			
			for(lastNum = 1; lastNum <=9; lastNum++){
				System.out.println(firstNum + " x " + lastNum + " = " + firstNum * lastNum);
			}
			System.out.println();
		}
	}
}
