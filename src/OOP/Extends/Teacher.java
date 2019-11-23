package OOP.Extends;

import OOP.Extends.Worker;

public class Teacher extends Worker {
    {
        System.out.println("");
        System.out.println("Сотрудник - учитель");
        stavka=500;
    }

    public Teacher(String FirstName, String LastName) {
        super(FirstName, LastName);
    }

    public Teacher() {
super();
    }


    public Teacher(String FirstName, String LastName, int Age) {
    super(FirstName, LastName, Age);
    }
    public Teacher (String FirstName, int Godstart){
        this.FirstName=FirstName;
        this.setGodStarta(Godstart);
    }
    public int getStage() {
        int a = super.getStage()*2;
        return  a;
    }
    public double zarplata (int kolvochas){
        return kolvochas*stavka;
    }
}
