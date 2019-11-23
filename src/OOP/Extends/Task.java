package OOP.Extends;

public class Task {

    public static void main(String[] args)  {
        //учитель
Teacher T1 = new Teacher();
Teacher T2 = new Teacher("Ivanov", "Ivan");
        System.out.println("Учитель два " +T2.FullName);
        Teacher T3 = new Teacher("Petrrr", "Petya", 12);
        System.out.println("Учитель tri " +T3.FullName + T3.getAge());
        Teacher T5 = new Teacher("Spiridonoc", 2015);
        System.out.println(T5.FirstName + T5.getgodStarta());
        System.out.println("Стаж" + T5.getStage());
        System.out.println("Зарплата" + T5.zarplata(20));


Povar P1 = new Povar("Serg", "Sereja");
        System.out.println(P1.FirstName);
            System.out.println(P1.zarplata(20));


        System.out.println("Общее кол-во работников "+Worker.GetKolvo());





    }

}
