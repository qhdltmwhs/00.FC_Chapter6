package ch08;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] intArr = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(intArr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("===exception===>");
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
		}

		System.out.println("here!!!");

	}
}
