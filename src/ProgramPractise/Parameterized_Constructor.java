package ProgramPractise;
class Geek
{
    String name;
    int id, roll;
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    Geek(String name, int id, int roll)
    {
        this.name = name;
        this.id = id;
        this.roll = roll;
    }
}
public class Parameterized_Constructor
{
    public  static void main (String[] args)
    {
        Geek geek = new Geek("SAIF", 10);
        Geek geek1 = new Geek("SAIF", 10, 33);
        System.out.println("Name is : " + geek.name + " and Id is : " + geek.id);
        System.out.println("Name is : " + geek1.name + " and Id is : " + geek1.id + " and roll no is : " + geek1.roll);
    }
}
