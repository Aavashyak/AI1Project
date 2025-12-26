package week7;
public class Car
{
    int modelNumber; //instance variable //object variable //attribute
    String brand;
    double price;
    void start()
    {
        System.out.println("Car Start");
    }
    
    void stop()
    {
        System.out.println("Car Stop");
    }
    
    public static void main (String args [])
    {
        Car c=new Car();
        Car c1=new Car();
        c.start(); // method calling // method invocation
        c.modelNumber=123;
        c.brand="Mercedez";
        c.price=20000;
        System.out.println("First Car"+"\n"+c.modelNumber+"\n"+c.brand+"\n"+c.price);
        c.stop();
        System.out.print("\n");
        c1.start();
        c1.modelNumber=456;
        c1.brand="Ferrari";
        c1.price=21000;
        System.out.println("Second Car"+"\n"+c1.modelNumber+"\n"+c1.brand+"\n"+c1.price);
        c1.stop();
    }
}