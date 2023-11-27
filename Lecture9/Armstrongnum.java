package Lecture9;

public class Armstrongnum {
    public static int numofdigit(int num)
    {
        int count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int num)
    {
        int backup=num;
        int ans=0;
          while(num>0)
          {
            int d=num%10;
            ans+=(int)Math.pow(d,numofdigit(backup));
            num/=10;

          }
          if(backup==ans)
          {
            return true;
          }
          else{
          return false;
          }

    }
    public static void printAllArmStrong(int n)
    {
        for (int i = 0; i <=n; i++) {
            if(isArmstrong(i))
            {
                System.out.println(i);
            }
            
        }
    }
    public static void main(String[] args) {
        int n=1000;
         printAllArmStrong(n);
       
    }
    
}
