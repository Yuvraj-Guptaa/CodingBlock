package Lecture04;

public class reversenumber {
    public static void main(String[] args) {
        int num=84352;
        int rev=0;
        while(num>0)
        {
            int d=num%10;
            // System.out.print(d);
            rev=rev*10+d;
            num/=10;

        }
        // System.out.println();
        System.out.println(rev);
    }
    
}
