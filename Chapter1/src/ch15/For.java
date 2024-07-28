package ch15;

public class For {

	public static void main(String[] args) {

		int num=1;
		int sum=0;
		
		while (num <= 10) {
			
			sum += num;
			num++;
			
		}
		System.out.println(sum); // 55
		
    // 동일

		for(num=1, sum=0; num<=10; num++) {
			
			sum += num;
			
		}
		System.out.println(sum); // 55
	}

}
