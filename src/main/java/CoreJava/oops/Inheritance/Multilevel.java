package CoreJava.oops.Inheritance;
class Office
{
    public void details()
    {
        String OfficeName="Zealous";
        String Place ="salem";
        System.out.println("OFFICE NAME IS:"+OfficeName);
        System.out.println("LOCATION:"+Place);
    }
}
class workers extends Office{
    public void workerdetails()
    {
        String Name="Annamalai";
        String Name1="Manoj";
        System.out.println("Worker Name:"+Name);
        System.out.println("Another Worker Name:"+Name1);
    }
}
class students extends workers
{
    public void courseDetails()
    {
        System.out.println("Java AND Python Full stack");
        System.out.println("Front End And Back End courses Available");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        students ss= new students();
        ss.details();
        ss.workerdetails();
        ss.courseDetails();
    }

}
