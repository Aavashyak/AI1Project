package week8;
public class worker
{
    private int id;
    private String name;
    private double basicsalary;
    private String position;
    private String department;
    private static String Company ="Deustche Bank";

    public worker(int id, String name, double basicsalary, String position, String department)
    {
        this.id=id;
        this.name=name;
        this.basicsalary=basicsalary;
        this.position=position;
        this.department=department;
    }

    public int getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setBasicsalary(double basicsalary)
    {
        this.basicsalary=basicsalary;
    }

    public void setPosition(String position)
    {
        this.position=position;
    }

    public String getPosition()
    {
        return this.department;
    }

    public double bonus()
    {
        return this.basicsalary*0.2+this.basicsalary;
    }
    
    public void display()
    {
        System.out.println("Worker Details"+"\n"+"Worker ID: "+this.id+"\n"+"Name: "+this.name+ "\n"+ "Basic Salary: "+this.basicsalary+"\n"+"Position: "+this.position+"\n"+"Salary after Bonus :"+bonus()+"\n"+Company);
    }
}