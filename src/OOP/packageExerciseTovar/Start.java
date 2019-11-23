package OOP.packageExerciseTovar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String name;
    public int length, width, height, year;
    public Start (String whisit) throws IOException {
        System.out.println("Ведите название изделия -  "+ whisit );
        this.name = reader.readLine();
        System.out.println("Ведите длину изделия в мм ");
        this.length = Integer.parseInt(reader.readLine());
        System.out.println("Ведите ширину изделия в мм ");
        this.width = Integer.parseInt(reader.readLine());
        System.out.println("Ведите высоту изделия в мм ");
        this.height = Integer.parseInt(reader.readLine());
        System.out.println("Ведите год выпуска изделия ");
        this.year = Integer.parseInt(reader.readLine());
    }
}
