package ProgramPractise;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main (String args[])
    {
        int num1=0, num2=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();

        for (int i=1; i<=n; i++)
        {
            System.out.println(num1 + " ");
            int sumOfPrevNum = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevNum;
        }
    }
}