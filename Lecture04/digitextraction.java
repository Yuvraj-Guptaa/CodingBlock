package Lecture04;

public class digitextraction {
    public static void main(String[] args) {
        int num=84352;
        while(num>0)
        {
            int d=num%10;
            System.out.println(d);
            num/=10;

        }
    }
    
    
}
