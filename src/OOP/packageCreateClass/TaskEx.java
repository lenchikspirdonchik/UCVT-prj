package OOP.packageCreateClass;

public class TaskEx {

    public static void main(String[] args)  {

        WorkerEx w4 = null;
        try {
            w4 = new WorkerEx("Васильев", "Васильев");
            System.out.println(w4.FullName);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Продолжаем");
    }



}

