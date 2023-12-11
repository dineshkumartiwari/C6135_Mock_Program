package mockPrograms;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 1, 2, 4, 9, 7, 6, 8 };
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate elements are- " + arr[j]);
				}
			}
		}

	}

}
