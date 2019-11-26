package Massive.ArrayList.package_ArrayListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
	//отсортировать исходный список
//разделить исходный список на 2 списка: четные и нечетные числа
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList <Integer> chet =  new ArrayList<>();
		ArrayList <Integer> nechet =  new ArrayList<>();
		Random rnd = new Random();
		int a;
		for (int i = 1; i <= 10; i++) {
			a = rnd.nextInt(10);
			list.add(a);
		}
		for (int i = 0; i <list.size() ; i++) {
			if (list.get(i)%2==0) chet.add(list.get(i));
			else nechet.add(list.get(i));
		}

		System.out.println("исходный список");
		for (int aaa : list) {
			System.out.printf("%d ",aaa);
		}

		System.out.println("\nЧетный список");
		for (int aaa : chet) {
			System.out.printf("%d ",aaa);
		}
		System.out.println("\nНечетный список");
		for (int aaa : nechet) {
			System.out.printf("%d ",aaa);
		}


	}

}
