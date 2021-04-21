package ProgramPractise;

public class SubClass_Inheritance extends SuperClass_Inheritance
{
    int z;
    public void multiplication(int x, int y)
    {
        z = x * y;
        System.out.println("Multiplication of two numbers: " + z);
    }
    public  static  void main (String[] args)
    {
        int a=10, b=20;
        SubClass_Inheritance demo = new SubClass_Inheritance();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }
}
