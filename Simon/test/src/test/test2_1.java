package test;

public class test2_1 {
	/**
	* @param args
	*/
	public static void main(String[] args) {
		System.out.println(toUSD(1,65.5));
	}
	static long toUSD(int rur, double course) {
	return (long) (rur*course);
	}
	}