package week8;
public class Student
{
    private int id;
    private String name;
    private String address;
    private long phonenum;
    private static String collegename ="Technische Üniversität von München";
    
    public Student(int id, String name, String address, long phonenum)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.phonenum=phonenum;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    
    public long getPhonenum()
    {
        return this.phonenum;
    }
    
    public void display()
    {
        System.out.println("Student Details"+"\n"+"Student ID: "+this.id+"\n"+"Name: "+this.name+ "\n"+ "Address: "+this.address+"\n"+"Contact: "+this.phonenum+"\n"+collegename);
    }
}