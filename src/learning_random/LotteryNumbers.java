package learning_random;

import java.util.Random;

public class LotteryNumbers {

	
	public static void main(String[] args) {
		Random ra = new Random();
		int l1 = ra.nextInt(100);
		int l2 = ra.nextInt(100);
		int l3 = ra.nextInt(100);
		int l4 = ra.nextInt(100);
		int l5 = ra.nextInt(100);
		int l6 = ra.nextInt(100);
		System.out.println("Today's lottery numbers are " + l1 + ", " + l2 + ", " + l3 + ", " + l4 + ", " + l5 + ", and " + l6 + "!");
	}
	
	
}
