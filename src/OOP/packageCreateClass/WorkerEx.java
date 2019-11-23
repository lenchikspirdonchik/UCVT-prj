package OOP.packageCreateClass;

public class WorkerEx {
    String LastName, FirstName, FullName;

    public WorkerEx(String FirstName, String LastName) throws Exception
    {
        if (FirstName.equals(LastName)) {
            throw new Exception("Объект с одинаковым именем и фамилией не может быть создан");
        }
        else
        {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.FullName = FirstName + " " + LastName;
        }
    }


}
