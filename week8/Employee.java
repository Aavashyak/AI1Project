package week8;
public class Employee
{
    private int id; //instance variable
    private String name;
    private double salary;
    private static String companyName = "ING Group"; //static variable
    
    public Employee (int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void display()
    {
        System.out.println("ID: "+ this.id+"\n"+ "name is "+ this.name+ "\n" +"salary is "+ this.salary+ "\n" +"id is "+ this.id+"\n"+"Company name is "+ companyName);
    }
    
    public double getSalary()
    {
        double annualSalary=this.salary*12;
        return annualSalary;
    }
}