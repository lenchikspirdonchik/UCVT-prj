package ControlWork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Task {
	//создать static список покупок
	//создать static массив клиентов clients
	//создать static массив клиентов продуктов tovars

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
static Client[] clients=new Client[5];
static Product[] tovars=new Product[5];
static Pokupka add;
static ArrayList<Pokupka> pokupki=new ArrayList<>();
	public static void main(String[] args) throws IOException {

		System.out.println("Программа учета покупок в магазине");
		tovars[0] = new Product(1, "молоко", 50);
		tovars[1] = new Product(2, "хлеб", 35);
		tovars[2] = new Product(3, "масло", 110);
		tovars[3]= new Product(4, "яблоки", 90);
		tovars[4] = new Product(5, "сыр", 300);

		clients[0] = new Client(1,"Иванов");
		clients[1] = new Client(2,"Петров");
		clients[2] = new Client(3,"Сидоров");
		clients[3] = new Client(4,"Пушкин");
		clients[4] = new Client(5,"Гоголь");

		String flag = "1";
		do {
			System.out.print("Что Вы хотите? ");
			System.out.print("1-создать покупку для клиента ");
			System.out.print("2-распечатать статистику ");
			System.out.print("3-закончить ");
			String v = reader.readLine();
			switch (v) {
				case "1":
					createPokupkaForClient();
					break;
				case "2":
					printStatistika();
					break;

			}
			System.out.println("Если хотите продолжить работать с программой, нажмите 1, иначе - 2: ");
			flag = reader.readLine();
		} while (flag.equals("1"));
		System.out.println("Работа с программой закончена");
	}



	private static void createPokupkaForClient() throws IOException {
		System.out.print("Введите дату: ");
		//ваш код
		String data =reader.readLine();

		System.out.print("Ведите id клиента: ");
		// ваш код
		//создать покупку
		int id =Integer.parseInt(reader.readLine());
		int idprod =0;
		System.out.println("Клиент "+ clients[id-1].name );
		 add=new Pokupka(data, clients[id-1]);

		//начинается ввод купленных продуктов и их количества
		String flag = "1";
		do {
			//предлагаем ввести id и кол-во продукта
			//и добавляем все это в список купленных продуктов
			System.out.print("Ведите id продукта: ");
			 idprod =Integer.parseInt(reader.readLine());
			//Вы выбрали молоко по цене 50
			System.out.println("Вы выбрали "+ tovars[idprod-1].name +" по цене "+ tovars[idprod-1].price);
			System.out.print("Ведите кол-во продукта: ");
			int kolvo =Integer.parseInt(reader.readLine());
			add.addProduct(tovars[idprod-1], kolvo);



			System.out.println("Если хотите продолжить ввод продуктов, нажмите 1, иначе 2: ");
			flag = reader.readLine();
		} while (flag.equals("1"));
		System.out.println("Ввод продуктов закончен");
		//добавить созданную покупку в список покупок
		pokupki.add(add);
	}

	private static void printStatistika() {
		System.out.println("Список покупок");

		//ваш код
		for (int i = 0; i <pokupki.size(); i++) {
			System.out.println(pokupki.get(i).date +"\t"+ pokupki.get(i).client.name);
			System.out.println("Id товара\tНаименование\tЦена\t Кол-во\tСтоимость");
			for (int j = 0; j <pokupki.get(i).products.size() ; j++) {
				System.out.print(pokupki.get(i).products.get(j).id + "\t\t\t");
				System.out.print(pokupki.get(i).products.get(j).name + "\t\t\t");
				System.out.print(pokupki.get(i).products.get(j).price + "\t\t\t");
				System.out.print(pokupki.get(i).kolvos.get(j) + "\t\t\t");
				System.out.print(pokupki.get(i).products.get(j).price + pokupki.get(i).kolvos.get(j) + "\n");
			}
		}
//1 123 1 1 2 1 2 12 2 1



		/*
		  16.12.2019	Пушкин
		  Id товара	Наименование	Цена	Кол-вo	Стоимость
		  3		масло		110	10	1100
		  4		яблоки		90	10	900
		  Итого на 2000 руб.
*/
		System.out.println("\n============================================");

	}

}
