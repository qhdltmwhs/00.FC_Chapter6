package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		
		/*
		 * Decorator pattern을 활용한 커피머신 만들기 
		 */
		Coffee kenyaAmericano = new KenyaAmericano();
		kenyaAmericano.brewing();
		System.out.println();

		Coffee kenyaLatte = new Latte(kenyaAmericano);
		kenyaLatte.brewing();
		System.out.println();

		Coffee kenyaMochaLatte = new Mocha(new Latte(new KenyaAmericano()));
		kenyaMochaLatte.brewing();
		System.out.println();

		WhippedCream etiopiaWhippedMocha = 
				new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
		etiopiaWhippedMocha.brewing();
		System.out.println();

	}

}
