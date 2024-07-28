package ch17;

public class Break {
	public static void main(String[] args) {

		int sum = 0;
		int num;
		
		for(num = 1; ; num++) {
			
			sum += num;
			if(sum > 100) // 내부에서 조건 돌리기
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	
	}
}
