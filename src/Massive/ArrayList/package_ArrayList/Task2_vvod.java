package Massive.ArrayList.package_ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Ввод чисел, пока не будет нажата Enter (пустой символ)
public class Task2_vvod {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Вводите слова через Enter");
		while (true) {
			String s = reader.readLine();
			if (s.isEmpty())
				break;
			list.add(s);
		}
		System.out.println("Конец ввода");
		for (String aaa : list) {
			System.out.println(aaa);
		}

	}

}
