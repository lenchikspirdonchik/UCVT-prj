package Massive.ArrayList.package_ArrayList;

import java.util.Comparator;

public class Cat  {
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String name="";
	public int age=0;


	public static Comparator <Cat> AgeComparator = new Comparator<Cat>() {
		@Override
		public int compare(Cat c1, Cat c2) {
			return c1.age-c2.age;
		}
	};
	public static Comparator <Cat> NameComparator = new Comparator<Cat>() {
		@Override
		public int compare(Cat c1, Cat c2) {
			return c1.name.compareTo(c2.name);
		}
	};
}
