package ch09;

public class Constant {

  public static void main(String[] args) {
		final int MAX_NUM = 1024;
		final int MIN_NUM;
		
		System.out.println(MAX_NUM);

    // MAX_NUM = 2048; 덮어씌울 수 없다.
    MIN_NUM = 0; // 초기값 설정
		
    System.out.println(MIN_NUM); // 0

  }
}
