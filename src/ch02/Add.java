package ch02;

@FunctionalInterface
public interface Add {
	
	/*
	 * @FunctionalInterface
	 * 하나의 메서드만 선언 
	 */
	public int add(int x, int y);
	//public int sub(int x, int y); // 선언시 에러
}
