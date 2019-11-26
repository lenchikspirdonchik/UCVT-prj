package Massive.ArrayList.package_ArrayListExercise;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
	//создать список, содержащий числа, взятые из исходного списка. Числа должны быть >5
//сделать это нужно с помощью НАПИСАННОЙ ВАМИ САМИМИ функции принимающей //исходный список и возвращающей список, в котором элементы больше 5
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random rnd = new Random();
		int a;
		for (int i = 1; i <= 10; i++) {
			a = rnd.nextInt(10);
			list.add(a);
		}

		System.out.println("исходный список");
		for (int aaa : list) {
			System.out.printf("%d ",aaa);
		}


		ArrayList<Integer> neew  = new ArrayList<>();
		neew.addAll(list);
		System.out.println("\nНовый список");
		for (int aaa:soort(neew))
		{
			System.out.printf("%d ",aaa);
		}
		System.out.println("\nold one");
		for (int aaa : list) {
			System.out.printf("%d ",aaa);
		}
	}

	//здесь ‚Ваша функция
static ArrayList<Integer> soort (ArrayList<Integer> mylist){
	for (int i = 0; i < mylist.size();) {
		if (mylist.get(i) <= 5) {
			mylist.remove(i);
		}
		else {
			i++;
		}
	}
	return mylist;
}
}
