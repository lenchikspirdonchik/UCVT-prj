package OOP.packageExercise;

import java.io.*;
import java.util.Scanner;

public class Task1_Triangle {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите стороны треугольника:");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        double a = Double.parseDouble(bufferedReader.readLine());
        double b = Double.parseDouble(bufferedReader.readLine());
        double c = Double.parseDouble(bufferedReader.readLine());

        Triangle triang = new Triangle(a,b,c);

        System.out.println("Треугольник со сторонами a = "+ triang.getA() +" b = "+ triang.getB() +" c = "+ triang.getC());
        System.out.println("Треугольник "+ Triangle.Tip(triang));
        System.out.printf("высота, опущенная на сторону a = %2.2f\n", triang.getHA());
        System.out.printf("высота, опущенная на сторону b = %2.2f\n", triang.getHB());
        System.out.printf("высота, опущенная на сторону c = %2.2f\n", triang.getHC());
        System.out.printf("Периметр треугольника = %2.2f\n", Triangle.P(triang));
        System.out.printf("Площадь треугольника (Первый способ) = %2.2f\n", Triangle.S(triang));
        System.out.printf("Площадь треугольника (Второй способ) = %2.2f\n", Triangle.S(triang.getA(), triang.getHA()));
        System.out.printf("Радиус описанной окружности = %2.2f\n",Triangle.R(triang));
        System.out.printf("Радиус вписанной окружности = %2.2f\n", Triangle.r(triang));
    }
}