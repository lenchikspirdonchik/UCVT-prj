package Massive.ArrayList.package_ArrayList;

import Massive.ArrayList.package_ArrayList.Cat;

import java.util.ArrayList;
import java.util.Collections;


public class Task4_sort {

	public static void main(String[] args) {
		//создаем список
		ArrayList<Cat> cats = new ArrayList<>();
		//запонЯем список новыми котами
		cats.add(new Cat("Васька", 6));
		cats.add(new Cat("Тузик", 2));
		cats.add(new Cat("Жучок", 1));
		cats.add(new Cat("Альма", 8));
		cats.add(new Cat("Пушок", 7));
		//распечатаем список
		for (Cat aaa : cats) {
			System.out.println(aaa.name+" "+aaa.age);
		}
		System.out.println("сортируем котов по имени ");
		Collections.sort(cats, Cat.NameComparator);
		System.out.println(cats);

		for (Cat aaa : cats) {
			System.out.println(aaa.name+" "+aaa.age);
		}
		System.out.println("сортируем котов по возрасту ");
		Collections.sort(cats,Cat.AgeComparator);
		System.out.println(cats);


		for (Cat aaa : cats) {
			System.out.println(aaa.name+" "+aaa.age);
		}
	}

}
