package OOP.packageCreateClass;

import java.util.*;

public class Worker {
    String LastName, FirstName, FullName;
    private double age = 0;
    private int godStarta = 0;
    private int stage = 0;
    public double stavka;
    {
        stavka=500;
    }
    private static int Kolvo = 0;

    public Worker()
    {
        Kolvo++;
    }

    public Worker(String FirstName, String LastName) {
        this();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.FullName=FirstName+" "+LastName;

    }
    public Worker(String FirstName, String LastName, int age) {
        this(FirstName, LastName);
        this.setAge(age);
    }




    public int getAge() {

        return (int)age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Значение не может быть <0");
        } else {
            this.age = age;
        }

    }

    public int getGodStarta() {
        return this.godStarta;
    }

    public void setGodStarta(int godStarta) {

        if (godStarta < 0) {
            System.out.println("Значение не может быть <0");
        } else {
            this.godStarta = godStarta;

        }

    }

    public int getStage() {
        if (godStarta == 0) {
            System.out.println("Вы не указали год начала работы в организации");
        } else {

            Calendar c = new GregorianCalendar();
            int god = c.get(Calendar.YEAR);
            stage = god - godStarta;
        }
        return stage;

    }
    public double getDoubleAge() {
        return age;
    }

    public void setDoubleAge(double age) {
        if (age < 0) {
            System.out.println("Значение не может быть <0");
        } else {
            this.age = age;
        }

    }
    public double zarplata() {
        return stavka;
    }

    public double zarplata(int mes) {
        return stavka * mes;
    }

    public double zarplata(int mes, int stage) {
        double k = 1;
        if (stage >= 3) {
            k = 1.2;
        }
        if (stage >= 5) {
            k = 1.5;
        }
        return k * stavka * mes;
    }
    public static int getKolvo()
    {
        return Kolvo;
    }


}
