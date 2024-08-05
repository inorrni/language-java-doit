package ch17;

public class Array {

	public static void main(String[] args) {

		int[] arr1 = new int[10]; // int배열에 arr가 맘에 든다.
		// int arr2[] = new int[10];
		
		int[] numbers = {1,2,3,4,5,6,7,8};
		
		// for(int i = 0; i < numbers.length; i++) {
		// 	System.out.println(numbers[i]);
		// }
		
		System.out.print("numbers: ");
		for(int i : numbers) {
			// 	System.out.println(numbers[i]); 
			// i는 인덱스가 아닌 numbers의 각 요소를 뜻하기 때문에 직접 나타내야 한다.
			System.out.print(i + " ");
		}
		System.out.println();

		// ----------------------------------------------------------------
		int[] ids;
		ids = new int[] {10, 20, 30};
		
		System.out.print("ids: ");
		for(int id : ids) {
			System.out.print(id + " ");
		}
		System.out.println();
		
		// ----------------------------------------------------------------
		int[] arr = new int[10];
		
		for(int i = 0, num=1; i<arr.length; i++, num++) {
			arr[i] = num;
		}
		
		int total = 0;
		for(int i = 0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println("total num: " + total);
		
		// ----------------------------------------------------------------
		int count = 0;
		double[] dArr = new double[5];
		dArr[0] = 1.1; count++; 
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		double doubleTotal = 1;
		
		for(int i = 0; i<count; i++) {
			doubleTotal *= dArr[i];
		}
		
		System.out.println("total double: " + doubleTotal);
		
		// ----------------------------------------------------------------
		char[] alphabets = new char[26];
		char ch = 'A';
		
		// for(int i : alphabets) { // i는 알파벳 배열의 요소값을 참조하기 때문에 인덱스로 사용할 수 없다.
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		System.out.print("alphabets: ");
		for(char alpha : alphabets) {
			System.out.print(alpha +  " " );
		}
	}
}
