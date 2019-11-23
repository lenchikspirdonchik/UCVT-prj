package Massive.package2_ExerciseArray;

import java.io.*;

public class Book {
public String name;
public String avtor;
private int kolvo;
private static int i=0;

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public int getKolvo() {
        return kolvo;
    }

    public  Book () throws IOException {
        i++;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.printf("Ведите название %d книги ", i);
        name = bufferedReader.readLine();
        System.out.printf("Ведите автора %d книги ", i);
        avtor = bufferedReader.readLine();
    }
}
/*В классе Book
определите public текстовые поля для названия и автора книги.
определите private целое поле для кол-ва читателей (сделайте аксессоры)
в конструкторе запросите название и автора книги с клавиатуры*/