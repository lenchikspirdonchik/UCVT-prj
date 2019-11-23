package OOP.Extends;

public class Povar extends Worker {
    {
        System.out.println("Сотрудник - повар");
        stavka = 100;
    }
    public Povar(String FirstName, String LastName) {
        super(FirstName, LastName);
    }

    @Override
    public double zarplata(int a) {
        return stavka*a+100;
    }
}
