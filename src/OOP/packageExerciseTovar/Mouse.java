package OOP.packageExerciseTovar;

import java.io.IOException;

public class Mouse extends Tovar {

    {
        System.out.println("-----------------------------------------------");
        System.out.println("Создается новый товар");
        System.out.println("-----------------------------------------------");
    }


    @Override
    public String Code() {
        return null;
    }

    @Override
    public void Vvodtovar() throws IOException {
        start = new Start("компьютерная мышь: ");
    }


}
