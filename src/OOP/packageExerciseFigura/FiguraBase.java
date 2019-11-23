package OOP.packageExerciseFigura;

import java.io.IOException;

public abstract class FiguraBase {
    public Tochka tochka;
    public abstract double S ();
    public abstract double P ();
    public abstract void VvodParametrov() throws IOException;
}
