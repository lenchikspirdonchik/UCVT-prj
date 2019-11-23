package Massive.package1_Array;


import java.util.Random;

public class MyArrayClass {
        Random rnd=new Random();
    //создание массива
public static int [] Creat (int lengt, int min, int max){
    Random rnd=new Random();
    int [] m = new int[lengt];
    for (int i = 0; i <m.length ; i++) {
        m[i]=rnd.nextInt(max-min+1);
    }
    return m;
}
    //печать числового массива
public static void print (int [] m){
    for (int aaa: m
    ) {
        System.out.print(aaa);
    }
}
    //печать строкового массива

    //нахождение максимума
public static int max (int [] m){
    int mmax = m[0];

    for (int aa: m
    ) {
        mmax=aa>mmax?aa:mmax;
    }
    return mmax;
}
    //нахождение минимума
    public static int min (int [] m){
        int mmin = m[0];

        for (int aa: m
        ) {
            mmin=aa<mmin?aa:mmin;
        }
        return mmin;
    }
    //нахождение суммы
public static int s(int[]m){
    int ss=0;
    for (int aa: m
    ) {
        ss+=aa;
    }

    return ss;
}


}