package Massive.ArrayList.package_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
//удаление элементов из списка по условию
public class Task3_delete {

	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<>();
		Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10);
		/*for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 5) {
				list.remove(i);
				i--;
			}
		}*/
		//или
		for (int i = 0; i < list.size();) {
			if (list.get(i)>5) list.remove(i);
			else i++;
		}


		for (int aaa:list)
		{
			System.out.println(aaa);
		}

	}

}
