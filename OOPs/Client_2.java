package OOPs;

public class Client_2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="nobita";
        s1.Age=20;
        Student s2=new Student();
        s2.name="suzuka";
        s2.Age=22;

        s1.Intro();//10k chala gaya .intro me
        s2.Intro();//20k chala gaya .intro me
        //?gaya toh gayan kahan 10k 20k 
        //Answer is (this) variable,this variable me jata hai
    }
    
}
