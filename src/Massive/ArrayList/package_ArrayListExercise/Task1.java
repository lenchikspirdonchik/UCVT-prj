package Massive.ArrayList.package_ArrayListExercise;


import java.util.ArrayList;
import java.util.Random;

public class Task1 {
	// заполните список 5-ю неповторяющимися случайными целыми числами от 0 до
	// 10. Выведите.
	public static void main(String[] args) {
		Random rnd = new Random();
		int rndd = 0;
		ArrayList <Integer> love = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			rndd = rnd.nextInt(10);
			if (love.contains(rndd)==false) love.add(i, rndd);
			else i--;
		}
		for (int aaa:love)
		{
			System.out.println(aaa);
		}

	}

}
