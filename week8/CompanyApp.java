package week8;
public class CompanyApp
{
    public static void main (String args[])
    {
        Employee ee=new Employee(100,"Aavashyak",999999);
        ee.display();
        
        double finalSalary=ee.getSalary();
        System.out.println(finalSalary);
        
        int x=ee.getId();
        System.out.println(x);
        ee.setName("Altvashyak");
        ee.display();
    }
}