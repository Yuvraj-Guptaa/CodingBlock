package OOPs;//JVM has the access to whole package

public class CLlient {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.Age);
        System.out.println(s.name);
        System.out.println(s);
        Student s1=s;
        s1.Age=10;
        System.out.println(s.Age+" "+s1.Age);
        //Things at the same address got changed
    }
    
}
