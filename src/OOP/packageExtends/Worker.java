package OOP.packageExtends;

import java.util.*;

abstract public class Worker {
    private double age = 0;
    private int godStarta = 0;
    private int stage = 0;
    public String FirstName = "";
    public String LastName = "";
    public String FullName = "";
    public double stavka = 0;
    private static int Kolvo = 0;
    abstract double zarplata(int a);
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

    public static int GetKolvo() {
        return Kolvo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return (int) Math.round(age);
    }

    public void setGodStarta(int godStarta) {
        this.godStarta = godStarta;
    }

    public int getgodStarta() {
        return godStarta;
    }

    public int GetStage() {
        Calendar c = new GregorianCalendar();
        int god = c.get(Calendar.YEAR);
        stage = god - godStarta;
        return stage;
    }

}

