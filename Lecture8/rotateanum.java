package Lecture8;

public class rotateanum {
    public static void rotateopti(int num)
    {
        int n1=num;
        int count=0;
        int rot=1;
         while(num>0)
        {
            count++;
            num/=10;
        }
        num=n1;
         int divisor=(int)Math.pow(10,rot);
         int p1=num/divisor;
         int p2=num%divisor;
         int mult=(int)Math.pow(10,count-rot); 
         System.out.println((p2*mult+p1));
        
    }


    public static void main(String[] args) {
        rotateopti(12345);
    //     int num=12345;
    //     int n1=num;
    //     int count=0;
    //     int rot=4;
    //     int i=1;
    //     while(num>0)
    //     {
    //         count++;
    //         num/=10;
    //     }
        
    //     while(i<=rot%count)
    //     {
    //     int part2=n1%10;
    //     int part1= n1/10;
    //      int rotatedn=part2*(int)Math.pow(10,count-1)+part1;
    //     System.out.println(rotatedn);
    //     n1=rotatedn;
    //     i++;
        
    // }
}
    
}
