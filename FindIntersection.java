package week1day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 5, 6, 7, 8, 2, 1, 9 };
		int[] arr2 = { 7, 3, 4, 10, 1, 5 };
		int a1 = arr1.length;
		int a2 = arr2.length;
		System.out.println("The Intersection of two arrays are: ");
		for (int i = 0; i < a1; i++) {
			for (int j = 0; j < a2; j++) {
				if (arr2[j] == arr1[i]) {
					System.out.println(arr1[i]);
					break;
				}
			}

		}
	}

}

