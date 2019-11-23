package Massive.package1_Array;

import java.util.Arrays;

public class Task3_ArraysMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = {5,4,8,9,2,4,5,6};


		// сортировка
		System.out.println("Сортировка");
		Arrays.sort(m);


		// сортировка 2
		String[] sm = { "Кузя", "Пушок", "Васька", "Петька" };
		//Arrays.sort(sm);

		System.out.println("Сортировка2");
		Arrays.sort(sm, 1,3);


		// заполнение одинаковыми элементами
		System.out.println("заполнение одинаковыми элементами");
		int[] mo = new int[5];
		Arrays.fill(mo,10);


		//
		String[] mos = new String[5];
		Arrays.fill(mos, 0,2,"Привет");
		Arrays.fill(mos, 2,5,"Пока");



		// сравнение массивов
		System.out.println("сравнение массивов");
		int[] m1 = new int[5];
		int[] m2 = new int[5];
		Arrays.fill(m1, 5);
		Arrays.fill(m2, 5);
		boolean b = Arrays.equals(m1, m2);
		System.out.println(b);


		// копирование массивов (способ 1)
		System.out.println("копирование массивов 1");
		int[] mc = { 1, 2, 3, 4, 5 };
		int[] mc1 = new int[5];
		mc1 = Arrays.copyOf(mc, 10);// из какого массива, новая длина

		// копирование массивов (способ 2)
		System.out.println("копирование массивов 2");

		int[] mc2 = Arrays.copyOfRange(mc, 2, 4);//источник, старт, стоп-1

		// копирование массивов (способ 3)
		System.out.println("копирование массивов 3");
		int[] mc3 = new int[10];
		System.arraycopy(mc, 0, mc3, 2, 3);//массив источник, старт в источнике, массив-цель, старт в цели,  кол-во


		// копирование массивов (способ 4)
		System.out.println("копирование массивов 4");
		int[] mc4 = mc;


		// превращение в строку
		System.out.println("превращение в строку");
		String s = Arrays.toString(mc);
		System.out.println(s);

		// поиск элемента (возвращает индекс)
		System.out.println("поиск элемента (возвращает индекс)");
		int a = Arrays.binarySearch(mc1, 5);
		System.out.println(a);




	}

}
