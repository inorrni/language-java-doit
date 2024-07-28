package ch09;

public class TypeConversion {
  public static void main(String[] args) {
    double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1); // 1: 정수가 되어 소숫점 사라짐
		System.out.println(iNum2); // 2: f가 d로 명시적 형변환이 되어 d로써 더해짐
		
		int num = 1000;
		byte bNum = (byte)num;
		System.out.println(bNum); // -24: 더 작은 바이트로 잘려서 다른 값이 나옴 
  }
}
