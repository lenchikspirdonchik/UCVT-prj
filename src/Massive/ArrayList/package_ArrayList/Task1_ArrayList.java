package Massive.ArrayList.package_ArrayList;


import java.util.ArrayList;
import java.util.Collections;

public class Task1_ArrayList {

	public static void main(String[] args)  {
		//объявление списка

		ArrayList <String> dogs = new ArrayList<String>();

		//добавление элемента
		dogs.add("Белка");
		dogs.add("Стрелка");
		dogs.add("Шарик");
		dogs.add(2, "Палкан");

		//вывод списка
		System.out.println("Вывод списка");
Print(dogs);

		//замена элемента
		System.out.println("=============");
		System.out.println("Замена элемента");
		dogs.set(2, "Дружок");
		Print(dogs);

		//удаление элемента
		System.out.println("=============");
		System.out.println("Удаление элемента");
//dogs.remove(0);
//dogs.remove("Стрелка");
Print(dogs);

		//сортировка
		System.out.println("=============");
		System.out.println("Сортировка");
		Collections.sort(dogs);
		Print(dogs);









	}
static void Print (ArrayList <String> haha){
	for (int i = 0; i < haha.size() ; i++) {
		System.out.println(haha.get(i));
	}
}
}
