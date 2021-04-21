package ProgramPractise;

public class Sum_Polymorphism
{
    public int Sum(int x, int y)
    {
        return x + y;
    }
    public int Sum(int x, int y, int z)
    {
        return x + y + z;
    }
    public static void main (String[] args)
    {
        Sum_Polymorphism sum = new Sum_Polymorphism();
        System.out.println("Sum of two numbers are : " + sum.Sum(10,20));
        System.out.println("Sum of three numbers are : " + sum.Sum(10,20, 30));
    }
}
