package Recursion;

public class hw {

    
   
    
    public static void main(String[] args) {
        printinc(5);
        decreasing(5);
        
    }
    public static void decreasing(int n)
    {
        
        if(n==1)
        {
            System.out.println(n);
           
            return;

        }
         System.out.println(n);
        decreasing(n-1);
       
    }
    public static void printinc(int n)
    {  
        
        
        if(n==1)
        {
            System.out.println(n);
           
            return;

        }
        printinc(n-1);
        System.out.println(n);
        
        
        
        
        
        
    }
    public static void increasingdec(int n)
    {
        
    }

}

    
    
    
      
        
        
        

        
        
        
        
        


 
