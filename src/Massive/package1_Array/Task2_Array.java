package Massive.package1_Array;

import java.util.Arrays;

public class Task2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//создаем
		int[]m=MyArrayClass.Creat(10,5,15);
		//печатаем
		MyArrayClass.print(m);
		//максимум
		int max = MyArrayClass.max(m);
		System.out.println("максимум="+max);
		//минимум
		int min = MyArrayClass.min(m);
		System.out.println("минимум="+min);
		//сумма
		int s=MyArrayClass.s(m);
		System.out.println("сумма элементов="+s);




	}



}
