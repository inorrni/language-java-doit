package ch15;

public class While {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while (num<=10) {
			
			sum += num;
			num++;
			
		}
		System.out.println(sum); // 55
		System.out.println(num); // 11
		System.out.println(num+1); // 12
		System.out.println(num); // 11
	}

}
