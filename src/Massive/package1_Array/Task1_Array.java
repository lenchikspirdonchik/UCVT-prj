package Massive.package1_Array;

import java.util.Random;

public class Task1_Array {
static Random rnd=new Random();
	public static void main(String[] args) {
		int [] a = new int[10];
		for (int i = 0; i <a.length ; i++) {
			a[i]=rnd.nextInt(20);
		}
		String b []={"me", "he"};
		for (int aaa: a
			 ) {
			System.out.println(aaa);
		}


	}

}
