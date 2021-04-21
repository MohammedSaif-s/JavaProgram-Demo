package ProgramPractise;

public class Encapsulation_2
{
    public static  void  main (String[] args)
    {
        Encapsulation_1 encap = new Encapsulation_1();

        encap.setGeekName("SAIF");
        encap.setGeekAge(24);
        encap.setGeekRoll(33);

        System.out.println("Name is: " + encap.getGeekName());
        System.out.println("Age is: " + encap.getGeekAge());
        System.out.println("Roll Number is: " + encap.getGeekRoll());
    }
}
