package ProgramPractise;

public class Encapsulation_1
{
    private String geekName;
    private int geekRoll;
    private int geekAge;

    public int getGeekAge ()
    {
        return geekAge;
    }

    public int getGeekRoll ()
    {
        return geekRoll;
    }

    public String getGeekName ()
    {
        return geekName;
    }

    public void setGeekAge (int newAge)
    {
        geekAge = newAge;
    }

    public void setGeekRoll (int newRoll)
    {
        geekRoll = newRoll;
    }

    public void setGeekName (String newName)
    {
        geekName = newName;
    }
}
