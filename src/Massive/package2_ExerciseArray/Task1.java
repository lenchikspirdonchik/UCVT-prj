package Massive.package2_ExerciseArray;


import java.io.*;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) throws IOException {
		Random rnd=new Random();
		int j=0;
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		Book [] books = new Book[3];
		for (int i = 0; i <3 ; i++) {
			books [i] = new Book();
			books[i].setKolvo(rnd.nextInt(15000));
		}
		System.out.println("Номер\tНавание\tАвтор\tКол-во читателей");
		System.out.println();
		for (Book aaaa: books){
			System.out.println(j++ + "\t\t"+ aaaa.name + "\t\t"+ aaaa.avtor + "\t\t"+ aaaa.getKolvo());
		}

		String kto = whoismax(books);
		System.out.println(kto);
	}
	static public String whoismax (Book []m) throws IOException {

		String max ="";

		Book [] books = new Book[3];
		if (books[1].getKolvo() > books[2].getKolvo()){
			if (books[1].getKolvo() > books[3].getKolvo()) {
				max= books[1].name;
			} else {
				max= books[3].name;
			}
		}


		return max;
	}
}

/*Напишите программу, в которой
Создается массив книг (3 штуки)
Заполните массив 3-мя книгами.
Количество читателей - случайные числа от 1 до 5 - задаются для каждой книги здесь.
Выведите массив на печать.
Определите названия самых популярных книг (тех, у кого кол-во читателей максимальное).
Для этого создайте здесь же
static public функцию, анализирующую массив книг и возвращающую текстовую переменную
с перечнем самых популярных книг
Примерный вид задачи:

Ведите название 1 книги Сказки
Ведите автора 1 книги Пушкин
Ведите название 2 книги Физика
Ведите автора 2 книги Рымкевич
Ведите название 3 книги Стихи
Ведите автора 3 книги Тютчев
Номер	Навание	Автор	Кол-во читателей
1		Сказки	Пушкин		4
2		Физика	Рымкевич	1
3		Стихи	Тютчев		4
Популярные книги Сказки, Стихи*/

