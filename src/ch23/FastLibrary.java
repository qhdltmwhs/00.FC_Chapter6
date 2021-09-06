package ch23;

import java.util.ArrayList;

public class FastLibrary {

	private ArrayList<String> shelf = new ArrayList<>();

	public FastLibrary() {

		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");

	}

	public synchronized String lendBook() throws InterruptedException {

		Thread t = Thread.currentThread();
		/*
		if (shelf.size() == 0) { //이코드는 책을 대여 못하는 학생이 발생할 가능성이 있음
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		String book = shelf.remove(0);
		System.out.println(t.getName() + ": " + book + " lend");
		*/
		while (shelf.size() == 0) { // 이코드는 전부 책을 대여 가능
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		String book = shelf.remove(0);
		System.out.println(t.getName() + ": " + book + " lend");

		return book;

	}

	public synchronized void returnBook(String book) {

		Thread t = Thread.currentThread();

		shelf.add(book);
		notifyAll();
		System.out.println(t.getName() + ": " + book + " return");

	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<String> shelf) {
		this.shelf = shelf;
	}

}
