package OOPs;

import javax.management.RuntimeErrorException;

public class Student {
    //data members!!,Intializing your data members using parsing
    private int Age=2;
    private String name="gum shuda";
     Student()
    {
        Age=99;
         name="ghoda";
    }
    public Student(String name,int Age)
    {
        this.name=name;
        this.Age=Age;
    }
    public  void Intro()
    {
        System.out.println(name+" age is "+Age);
    }
    public void partyWith(String Name)
    {
        System.out.println(this.name+" party with "+Name);
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(int Age) throws Exception
    {
        if(Age<0)
        {
        // throw new RuntimeErrorException(null, "Bhai msy");
        throw new Exception("bhai mere mat kar");
        }
    }
    
}
