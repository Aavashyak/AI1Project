package week8;
public class StudentApp
{
    public static void main (String args[])
    {
        Student ss=new Student(1,"Aavashyak","Mhepi",9843446806L);
        ss.display();
        
        int x=ss.getId();
        System.out.println(x);
        ss.setName("Altvashyak");
        ss.setAddress("Nayabazar");
        ss.display();
    }
}