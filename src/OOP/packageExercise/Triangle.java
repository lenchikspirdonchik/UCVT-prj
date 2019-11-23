package OOP.packageExercise;

public class Triangle {
    private static double a, b, c;
    private static String tip;

    // ввод

    public Triangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a)
        {
            this.a =a;
            this.b=b;
            this.c=c;
        }
        else {
            System.out.println("Введены недопустимые значения!!\nТреугольник с таким соотношением сторон не может быть создан");
            System.exit(0);
        }
    }

    // Getter a,b,c
    public double getA (){
        return  a;
    }
    public double getB (){
        return  b;
    }
    public double getC (){
        return  c;
    }


    // Рассчет определений высот, опущенных на a,b,c
    public double getHA(){
        double cos = (a*a +b*b -c*c)/(2*a*b);
        double sin = Math.sqrt(1-cos*cos);
        double ha = b*sin;
        return ha;
    }

    public double getHB(){
        double cos = (a*a +c*c -b*b)/(2*a*c);
        double sin = Math.sqrt(1-cos*cos);
        double hb = a*sin;
        return hb;
    }

    public double getHC(){
        double cos = (b*b +c*c -a*a)/(2*b*c);
        double sin = Math.sqrt(1-cos*cos);
        double hc = b*sin;
        return hc;
    }

    // рассчет периметра
    public static  double P (Triangle trn){
        double perim = trn.getA() + trn.getB() + trn.getC();
        return perim;
    }

    // рассчет площади
    public static double S (Triangle trn){
        double p = trn.getA() + trn.getB() + trn.getC();
        double square = Math.sqrt(p*(p- trn.getA())*(p- trn.getB())*(p- trn.getC()));
        return square;
    }

    public static double S (double a, double ha){
        double s = (a*ha)/2;
        return s;
    }

    // рассчет радиуса описанной окружности
    public static double R (Triangle trn){
        double p = trn.getA() + trn.getB() + trn.getC();
        double sqr = Math.sqrt(p*(p- trn.getA())*(p- trn.getB())*(p- trn.getC()));
        double Rr=(trn.getA() * trn.getB() * trn.getC())/(4*sqr);
        return Rr;
    }

    // рассчет радиуса вписанной окружности
    public static double r (Triangle trn){
        double p = trn.getA() + trn.getB() + trn.getC();
        double sqr = S(trn);
        double Rr=(trn.getA() * trn.getB() * trn.getC())/(4*sqr);
        double rr=sqr/(p*0.5);
        return rr;
    }

    // вывод информации о треугольнике
    public static String Tip (Triangle trn){
        String tip ="";
        if(trn.getA()==trn.getB() && trn.getA()==trn.getC() && trn.getC()==trn.getB()) tip="равносторонний";
        else if (trn.getA()==trn.getB() || trn.getA()==trn.getC() ||trn.getC()==trn.getB()) tip="равнобедренный";
        else {
            tip="обычный";
            if (trn.getC()*trn.getC() ==  (trn.getA()*trn.getA())+(trn.getB()*trn.getB()))tip+=" и прямоугольный";
        }
        return tip;
    }
}