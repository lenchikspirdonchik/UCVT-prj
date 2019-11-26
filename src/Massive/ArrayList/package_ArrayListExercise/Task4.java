package Massive.ArrayList.package_ArrayListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Task4 {

	public static String[][] biblioteka = {
			{"Физика  ", "Рымкевич"},
			{"Лирика  ", "Тютчев Ф.И."},
			{"Сказки  ", "Пушкин А.С."},
			{"Алгебра ", "Перышкин"},
			{"Office  ", "Microsoft"},
			{"    Незнайка", "Носов  "},
			{"    На дне  ", "Горький"},
			{"Муму    ", "Тургенев"},
			{"Мцыри   ", "Лермонтов"},
			{"Стоик   ", "Драйзер  "}

	};

	public static void main(String[] args) {
		Random rnd = new Random();
		ArrayList<Book> mylovearray = new ArrayList<>();
		ArrayList<Integer> rondom = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int bok = rnd.nextInt(9);
			int chit = rnd.nextInt(12345);
			if (rondom.contains(bok) == false) {
				Book books = new Book();
				books.avtor = biblioteka[bok][1];
				books.nazv = biblioteka[bok][0];
				books.setKol(chit);
				mylovearray.add(books);
				rondom.add(bok);
			} else i--;


		}


		System.out.println("Название\t\tАвтор\t\tКол-во читателей");
		for (int i = 0; i < mylovearray.size(); i++)
			System.out.println(mylovearray.get(i).avtor + "\t\t" + mylovearray.get(i).nazv + "\t\t" + mylovearray.get(i).getKol());
		System.out.println();


		System.out.println("Популярные книги");
		System.out.println("Название\t\tАвтор\t\tКол-во читателей");
		Collections.sort(mylovearray, Book.ChitComp);
		for (int i = 0; i < mylovearray.size(); i++)
			System.out.println(mylovearray.get(i).avtor + "\t\t" + mylovearray.get(i).nazv + "\t\t" + mylovearray.get(i).getKol());
		System.out.println();

	}
}
/*


/*
 * Напишите программу, в которой создается ArrayList книг (5 штук).
 *  Т.е. ArrayList должен быть типа Book
 * Названия и авторы случайным образом берутся из двумерного массива biblioteka.
* Как обращаться к элементу двумерного массива: myArray [номер строки][номер столбца]
 * Количество читателей - случайные числа от 1 до 15.
 * Выведите список на печать.
 * Создайте список самых популярных книг ArrayList popbooks.
 * Для этого создайте функцию возвращающую список книг, у которых максимальное кол-во читателей.
 * Примерный вид задачи:
 * 	Название		Автор		Кол-во читателей
	Стоик   	Драйзер  	0
	Физика  	Рымкевич	2
	Office  	Microsoft	4
	Лирика  	Тютчев Ф.И.	1
	Сказки  	Пушкин А.С.	4
Популярные книги
	Office  	Microsoft	4
	Сказки  	Пушкин А.С.	4


Если работаете быстро, то пусть в исходном списке книги не повторяются.
Если работаете очень быстро быстро, то отсортируйте исходный список по кол-ву читателей.

 */
