package Massive.ArrayList.package_ArrayListExercise;

import java.util.Comparator;

public class Book {
	public String nazv="";
	public String avtor="";
	private int kol=0;
	
	public int getKol() {
		return kol;
	}
	public void setKol(int kol) {
		this.kol = kol;
	}
	public static Comparator<Book> ChitComp = new Comparator<Book>() {
		@Override
		public int compare(Book o1, Book o2) {
			return o1.getKol()-o2.getKol();
		}
	};
}
/* public static Comparator <Cat> AgeComparator = new Comparator<Cat>() {
@Override
public int compare(Cat c1, Cat c2) {
		return c1.age-c2.age;
		}
		};
		*/