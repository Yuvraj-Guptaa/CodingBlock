package Lecture04;

public class primefactorization {
    public static void main(String[] args) {
        int num=11;
        int div=2;
        while(num>1)
        {
            if(num%div==0)
            {
                System.out.println(div);
                num/=div;
            }
            else{
                div++;
            }


        }
    }
    
}
