package january12;

public class Happyno {
     
        public static void main(String[] args) {
           // Happyno h=new Happyno();
            
            System.out.println(isHappy(2));
        }
        public static int extractdigit(int n)
        {
            int digitpow=0;
            while(n>0)
            {
                int d=n%10;
                digitpow+=Math.pow(d,2);
                n=n/10;
                
            }
            return digitpow;
        }
        public static boolean isHappy(int n) {
              boolean check=false;
            while(n!=1)
            {
                n=extractdigit(n);
               // System.out.println(n);
                
                if(n==1)
                {
                    check=true;
                    break;
                }
            }
            
          if(check)
          {
              return true;
          }
          else
          {
              return false;
          }
            
              
            
            
        }
    }
    

