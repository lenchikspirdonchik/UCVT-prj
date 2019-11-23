package OOP.Extends;

import java.util.*;

public abstract class Worker {
    private double age = 0;
    private int godStarta = 0;
    private int stage = 0;
    public String FirstName = "";
    public String LastName = "";
    public String FullName = "";
    public double stavka = 0;
    private static int Kolvo = 0;

    //инициализатор
    {
        System.out.println("");
        System.out.println("Добавляем нового сотрудника");
    }
    //конструктор 1
    public Worker() {
        Kolvo++;
    }
    //конструктор 2
    public Worker(String FirstName, String LastName) {
        this();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.FullName = FirstName + " " + LastName;
    }
    //конструктор 3
    public Worker(String FirstName, String LastName, int Age) {
        this(FirstName, LastName);
        this.setAge(Age);

    }
    public abstract double zarplata (int a);



    public static int GetKolvo() {
        return Kolvo;
    }

    public void setAge(int age) {
        if (age < 0) {

            System.out.println("Значение возраста не может быть <0");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return (int) Math.round(age);
    }

    public void setExactAge(double age) {
        if (age < 0) {
            System.out.println("Значение не может быть <0");
        } else {
            this.age = age;
        }
    }

    public double getExactAge() {

        return age;
    }

    public void setGodStarta(int godStarta) {
        if (godStarta < 0) {
            System.out.println("Значение не может быть <0");
        } else {
            this.godStarta = godStarta;

        }
    }

    public int getgodStarta() {
        return godStarta;
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

}
