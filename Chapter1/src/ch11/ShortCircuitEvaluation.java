package ch11;

public class ShortCircuitEvaluation {

  public static void main(String[] args) {
    int num1 = 10;
		int i = 2;
		boolean value;
		
    // 앞, 뒤 둘 다 참이어야 참.
		value = ((num1 = num1+10) < 10) && ((i = i+2) < 10);
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2
				
		// 앞에만 참이어도 참.
		value = ((num1 = num1+10) < 10) || ((i = i+2) < 10);
		System.out.println(value); // true
		System.out.println(num1); // 30
		System.out.println(i); // 4
  }
}
