package OOP.packageExerciseFigura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle extends FiguraBase {


    private int radious;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    {
        System.out.println("-----------------------------------------------");
        System.out.println("Начинаем вводить параметры окружности");
        System.out.println("-----------------------------------------------");
    }

    @Override
    public double S() {
        return Math.PI * getRadious()*getRadious();
    }

    @Override
    public double P() {
        return 2*Math.PI*getRadious();
    }

    @Override
    public void VvodParametrov() throws IOException {
tochka = new Tochka(" центра окружности: ");
        System.out.println("Введите радиус");
        this.radious = Integer.parseInt(reader.readLine());
    }

    public int getRadious() {
        return radious;
    }
}
