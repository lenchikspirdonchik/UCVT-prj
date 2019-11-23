package OOP.packageExerciseFigura;

import java.io.*;

public class Tochka {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int x,y;
    public Tochka(String whisit) throws IOException {
        System.out.println("Ведите координату x "+ whisit );
        this.x = Integer.parseInt(reader.readLine());
        System.out.println("Ведите координату y" + whisit);
        this.y = Integer.parseInt(reader.readLine());
    }

}
