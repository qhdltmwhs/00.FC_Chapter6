package ch10;

public class PasswordTest {

	public static void main(String[] args) {

		Password test = new Password();

		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류 없음1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abcd";
		try {
			test.setPassword(password);
			System.out.println("오류 없음2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("오류 없음3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abcde#1";
		try {
			test.setPassword(password);
			System.out.println("오류 없음4");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
