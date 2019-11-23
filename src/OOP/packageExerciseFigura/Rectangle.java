package OOP.packageExerciseFigura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle extends FiguraBase {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int frst, scnd;

    {
        System.out.println("-----------------------------------------------");
        System.out.println("Начинаем вводить параметры прямоугольника.");
        System.out.println("-----------------------------------------------");
    }


    @Override
    public double S() {
        return getFrst()*getScnd();
    }

    @Override
    public double P() {
        return 2*(getFrst()+getScnd());
    }

    @Override
    public void VvodParametrov() throws IOException {

        tochka = new Tochka(" левого нижнего угла прямоугольника: ");
        System.out.println("Введите 1-ю сторону прямоугольника: ");
        frst=Integer.parseInt(reader.readLine());
        System.out.println("Введите 2-ю сторону прямоугольника: ");
        scnd=Integer.parseInt(reader.readLine());
    }

    public int getFrst() {
        return frst;
    }

    public int getScnd() {
        return scnd;
    }
}
