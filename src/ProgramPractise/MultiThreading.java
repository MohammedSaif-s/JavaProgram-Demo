package ProgramPractise;
// Using extends keyword have to use Thread class
class MultiThreadingDemo implements Runnable
{
    public void run ()
    {
        try
        {
            System.out.println("Thread is : " + Thread
            .currentThread().getId() + " is running");
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught");
        }
    }
}
public class MultiThreading
{
    public static void main (String [] args)
    {
        int n=8;
        for (int i=0; i<n; i++)
        {
//            MultiThreadingDemo demo = new MultiThreadingDemo();
//            demo.start();
            Thread obj = new Thread(new MultiThreadingDemo());
            obj.start();
        }
    }
}
//    Thread Class vs Runnable Interface
//        If we extend the Thread class, our class cannot extend any other class
//        because Java doesn’t support multiple inheritance.
//        But, if we implement the Runnable interface, our class can still extend other base classes.