package ch22;

class Bank {

	private int money = 10000;

	public void saveMoney(int save) {
		
		/*
		 * synchronized(참조형 수식) {수행문};
		 */
		synchronized (this) {
			int m = getMoney();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setMoney(m + save);
		}

	}

	public synchronized void minusMoney(int minus) {

		int m = getMoney();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m - minus);

	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

class Park extends Thread {

	@Override
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney());
	}

}

class ParkWife extends Thread {

	@Override
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney());
	}
	/*
	@Override
	public void run() { // 직접 thread 메서드에 synchronized 블럭 처리하는 방식 
		synchronized (SyncMain.myBank) {
			System.out.println("start minus");
			SyncMain.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney());
		}
	}
	*/
}

public class SyncMain {

	public static Bank myBank = new Bank();

	public static void main(String[] args) {
		
		/*
		 * ## 동기화 (synchronization)
		 * - 두 개의 thread 가 같은 객체에 접근 할 경우, 동시에 접근 함으로써 오류가 발생 
		 * - 동기화는 임계영역에 접근한 경우 공유자원을 lock 하여 다른 thread의 접근을 제어
		 * - 동기화를 잘못 구현하면 deadlock에 빠질 수 있다.
		 * ## 자바에서는 synchronized 메서드나 synchronized 블럭을 사용
		 * ### synchronized 블럭
		 * -현재 객체 또는 다른 객체를 lock으로 만든다.
		 * ### synchronized 메서드
		 * - 객체의 메소드에 synchronized 키워드 사용
		 * - 현재 이 메서드가 속해있는 객체에 lock을 건다.
		 * - 자바에서는 deadlock을 방지하는 기술이 제공되지 않으므로 되도록이면 synchronized 
		 *   메서드에서 다른 synchronized 메서드는 호출하지 않도록 한다.
		 */
		Park p = new Park();
		ParkWife pw = new ParkWife();

		p.start();
		// pw.start();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		pw.start();
		// p.start();
	}

}
