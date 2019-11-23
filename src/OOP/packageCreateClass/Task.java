package OOP.packageCreateClass;


public class Task {

    public static void main(String[] args) {
        Worker w1 = new Worker();


        // задаем имя
        w1.FirstName = "Иванов";
        w1.LastName = "Иван";
        // задам возраст
        w1.setAge(15);
        int w1Age = w1.getAge();
        System.out.println(w1Age);
        // задаем год начала работы
        w1.setGodStarta(2000);
        // определяем стаж работы
        int stage = w1.getStage();
        System.out.println(stage);
        // задаем возраст дробным числом
        w1.setDoubleAge(15.5);
        double w1DoubleAge = w1.getDoubleAge();
        System.out.println(w1DoubleAge);
        //double zarplata=w1.zarplata();
        //double zarplata=w1.zarplata(2);
        double zarplata=w1.zarplata(2,stage);
        System.out.println(zarplata);
        Worker w2 = new Worker("Иван", "Иванов");
        System.out.println(w2.FullName);
        Worker w3=new Worker("Сидоров","Сидор",25);
        System.out.println(w3.FullName+" "+w3.getAge());

        System.out.println("Общее кол-во работников "+Worker.getKolvo());

    }

}
