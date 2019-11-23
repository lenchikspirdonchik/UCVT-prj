package Massive.package1_Array;

import java.util.Random;


public class Task4_Cat {
	static Random rnd=new Random();

	public static void main(String[] args) {

		String[] sm = { "Кузя", "Пушок", "Васька", "Петька", "Шарик" };
		Cat[] cats =new Cat[5];
		for (int i = 0; i < cats.length; i++) {
			cats[i]=new Cat(sm[i], rnd.nextInt(30));
		}

		for (Cat aaaa: cats){
			System.out.println(aaaa.name +" "+ aaaa.age);
		}
		Cat starikot = oldcat(cats);
		System.out.println("Oldest: "+starikot.name);
	}


	static Cat oldcat (Cat[] m){
		Cat max = m[0];
	for (Cat aa: m
	) {
		if (aa.age>max.age) max=aa;
	}
	return max;
}
}
