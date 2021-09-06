package ch23;

public class Student extends Thread {

	public Student(String name) {
		super(name);
	}

	@Override
	public void run() {

		try {
			String title = LibraryMain.library.lendBook();
			if (title == null) return;
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
