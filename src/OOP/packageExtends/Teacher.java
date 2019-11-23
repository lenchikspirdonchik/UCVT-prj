package OOP.packageExtends;

public class Teacher extends Worker {
    private int kvalifik=0;
    {
        stavka = 350;
        System.out.println("Сотрудник - учитель");
        System.out.println("");
    }
    public void setKvalifik(int kvalifik ) {
        this.kvalifik = kvalifik;
    }

    public int getKvalifik() {
        return kvalifik;
    }
    //конструктор 2
    public Teacher(String FirstName, String LastName) {
        super(FirstName, LastName);
    }
//конструктор 3

    public Teacher(String FirstName, String LastName, int Age) {
        super(FirstName, LastName, Age);
    }
    //конструктор 4
    public Teacher(String FirstName, String LastName, int Age, int kvalifik) {
        super(FirstName, LastName, Age);
        this.kvalifik=kvalifik;
    }

    public double zarplata(int kolChas) {

        return  stavka * kolChas+kvalifik*100;
    }
    //переопределяем метод
    public int GetStage() {
        int a=super.GetStage();//обращаемся к методу супер-класса
        return a*2;
    }
}
