package ch20;

class MyThread2 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
	}
	
}

public class ThreadTest2 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + " start");
		System.out.println("implements Runnable");
		
		MyThread2 mth = new MyThread2();
		
		Thread th1 = new Thread(mth);
		th1.start();

		Thread th2 = new Thread(new MyThread2());
		th2.start();

		System.out.println(Thread.currentThread() + " end");

	}

}