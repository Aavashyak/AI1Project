package week8;
public class calculateGrossSalary
{
    public static void main (String args[])
    {
        worker wr = new worker(1,"Aavashyak",10000,"Intern","Cybersecurity");
        wr.display();
        
        int x=wr.getId();
        System.out.println(x);
        wr.setBasicsalary(10000000.00);
        wr.setPosition("CEO");
        wr.display();
    }
}