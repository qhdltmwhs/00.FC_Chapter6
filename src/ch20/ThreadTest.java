package ch20;

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
	}

}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + " start");
		System.out.println("extends Thread");

		MyThread th1 = new MyThread();
		th1.start();

		MyThread th2 = new MyThread();
		th2.start();
		
		System.out.println(Thread.currentThread() + " end");
		
		/*
		 * 익명클래스로 thread 만들기
		 */
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.print("[[anonymous]]\t");
			}

		};
		runnable.run();

	}

}