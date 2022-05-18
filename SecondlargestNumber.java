package week1day2;


import java.util.Arrays;

public class SecondlargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(numbers);
		int length = numbers.length;

		for (int i = 0; i < length; i++) {
			System.out.println(numbers[i]);

		}
		System.out.println("Second Largest Number is" + numbers[length - 2]);
	}
}
