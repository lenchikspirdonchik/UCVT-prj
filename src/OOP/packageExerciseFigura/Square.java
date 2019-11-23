package OOP.packageExerciseFigura;

import java.io.IOException;

public class Square extends Rectangle {




    public void VvodParametrov() throws IOException {
        System.out.println("-----------------------------------------------");
        System.out.println("Начинаем вводить параметры квадрата");
        System.out.println("-----------------------------------------------");
        tochka = new Tochka(" левого нижнего угла квадрата ");
        System.out.println("Введите сторону квадрата");
        frst = Integer.parseInt(reader.readLine());
        scnd =frst;
    }

}
