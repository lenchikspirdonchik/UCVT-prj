package OOP.packageExerciseFigura;

import java.io.IOException;

public class Task {

	public static void main(String[] args)throws IOException  {
		//окружность
		Circle c=new Circle();
		c.VvodParametrov();
		System.out.println("Центр окружности  = "+c.tochka.x+", "+c.tochka.y);
		System.out.println("Радиус окружности  = "+" "+c.getRadious());
		System.out.println("Площадь окружности = "+c.S());
		System.out.println("Длина окружности = "+c.P());
		//прямоугольник
		Rectangle r=new Rectangle();
		r.VvodParametrov();
		System.out.println("Левый нижний угол  = "+r.tochka.x+", "+r.tochka.y);
		System.out.println("Размеры прямоугольника   = "+" "+r.getFrst()+" "+r.getScnd());
		System.out.println("Площадь прямоугольника = "+r.S());
		System.out.println("Периметр прямоугольника = "+r.P());
		//квадрат
		Square s=new Square();
		s.VvodParametrov();
		System.out.println("Левый нижний угол  = "+s.tochka.x+" "+s.tochka.y);
		System.out.println("Размеры квадрата   = "+" "+s.getFrst()+" "+s.getScnd());
		System.out.println("Площадь квадрата = "+s.S());
		System.out.println("Периметр квадрата = "+s.P());
		//треугольник

		Triangle t=new Triangle();
		t.VvodParametrov();
		System.out.println("Сторона a = "+t.getA());
		System.out.println("Сторона b = "+t.getB());
		System.out.println("Сторона c = "+t.getC());
		System.out.println("Площадь треугольника = "+t.S());
		System.out.println("Периметр треугольника = "+t.P());


	}

}
