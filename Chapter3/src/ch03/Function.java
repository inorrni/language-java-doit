package ch03;

public class Function {

  public static void main(String[] args) {
    int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		int total1 = addNum(30, 50);
		System.out.println(total1);
		
		sayHello("Hello");
		
		int sum = calcSum();
		System.out.println(sum);
		
	}

	public static int addNum(int num1, int num2) { // int로 반환
		
		return num1 + num2;
	}
	
	public static void sayHello(String str) { // void 반환값 없음
		System.out.println(str);
	}
	
	public static int calcSum() {
		
		int i;
		int sum = 0;
		
		for(i=0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	
  }
}
