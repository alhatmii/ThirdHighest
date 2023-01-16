import java.util.Arrays;

public class ThirdHighestNumber {
	
//	Method to be applied:
	public static int getThirdLargest(int[] a, int total) {
		
//		In this method we will sort all the numbers"
		Arrays.sort(a);
		
//		Return Third number from largest:
		return a[total - 3];
	}

	public static void main(String[] args) {

//		Array of numbers
		int a[] = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		
//		Print the third number:
		System.out.println("Third Largest: (" + getThirdLargest(a, 9) + ")");
	}

}
