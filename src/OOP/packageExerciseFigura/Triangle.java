package OOP.packageExerciseFigura;
import java.io.IOException;

public class Triangle extends FiguraBase {
    public Tochka tochka2;
    public Tochka tochka3;
    {
        System.out.println("-----------------------------------------------");
        System.out.println("Начинаем вводить параметры треугольника.");
        System.out.println("-----------------------------------------------");
    }
    @Override
    public double S() {
        double p = P()/2;
        return Math.sqrt(p*(p-getA()) * (p-getB()) * (p-getC()));
    }

    @Override
    public double P() {
        return getA()+getB()+getC();
    }

    @Override
    public void VvodParametrov() throws IOException {
        tochka = new Tochka(" 1-го угла треугольнка ");
        tochka2 = new Tochka(" 2-го угла треугольнка ");
        tochka3 = new Tochka(" 3-го угла треугольнка ");
    }
    public double getA (){
        return Math.sqrt((tochka2.x - tochka.x)*(tochka2.x - tochka.x) + (tochka2.y - tochka.y)*(tochka2.y - tochka.y));
    }
    public double getB (){

        return Math.sqrt((tochka3.x - tochka2.x)*(tochka3.x - tochka2.x) + (tochka3.y - tochka2.y)*(tochka3.y - tochka2.y));
    }
    public double getC (){

        return Math.sqrt((tochka.x - tochka3.x)*(tochka.x - tochka3.x) + (tochka.y - tochka3.y)*(tochka.y - tochka3.y));
    }

}
