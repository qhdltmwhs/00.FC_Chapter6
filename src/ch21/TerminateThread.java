package ch21;

import java.io.IOException;

public class TerminateThread extends Thread {

	private boolean flag = false;
	int i;

	public TerminateThread(String name) {
		super(name);
	}

	public void run() {

		while (!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " end");

	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) throws IOException {

		/*
		 * ## Thread 종료하기
		 * - Thread를 종료할 때 사용함
		 * - 무한 반복의 경우 while(flag)의 flag 변수값을 false로 바꾸어 종료를 시킴
		 */
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");

		threadA.start();
		threadB.start();
		threadC.start();

		int in;
		while (true) {
			in = System.in.read();
			if (in == 'A') {
				threadA.setFlag(true);
			} else if (in == 'B') {
				threadB.setFlag(true);
			} else if (in == 'C') {
				threadC.setFlag(true);
			} else if (in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			} else {
				System.out.println("type again");
			}
		}
		System.out.println("main end");

	}

}