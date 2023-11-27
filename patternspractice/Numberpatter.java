package patternspractice;
class Numberpatter
{
    public static void pattern23(int n)
    {
        int total1=1;
        int totalfspaces=5;
        int row=1;
        while(row<=n)
        {
            int countspaces=1;
            while(countspaces<=totalfspaces)
            {
                System.out.print(" ");
                countspaces++;
            }
            int count1=1;
            while(count1<=total1)
            {
                System.out.print("1");
                count1++;
            }
            System.out.println();
            total1+=2;
            totalfspaces--;
            row++;
        }
    }
    public static void pattern24(int n)
    {
        int total1=1;
        int totalfspaces=5;
        int row=1;
        while(row<=n)
        {
            int countspaces=1;
            while(countspaces<=totalfspaces)
            {
                System.out.print(" ");
                countspaces++;
            }
            int count1=1;
            while(count1<=total1)
            {
                System.out.print(row);
                count1++;
            }
            System.out.println();
            total1+=2;
            totalfspaces--;
            row++;
        }
    }
    public static void pattern25(int n)
    {
        int total1=1;
        int totalfspaces=5;
        int row=1;
        int count=1;
        while(row<=n)
        {
            int countspaces=1;
            while(countspaces<=totalfspaces)
            {
                System.out.print("\t");
                countspaces++;
            }
            int count1=1;
            while(count1<=total1)
            {
                System.out.print(count+"\t");
                count++;
                count1++;
            }
            System.out.println();
            total1+=2;
            totalfspaces--;
            row++;
            
        }
    }
    public static void pattern26(int n)
    {
        int total1=1;
        int totalfspaces=5;
        int row=1;
        int count=1;
        while(row<=n)
        {
            int countspaces=1;
            while(countspaces<=totalfspaces)
            {
                System.out.print("\t");
                countspaces++;
            }
            int count1=1;
            while(count1<=total1)
            {
                System.out.print(count+"\t");
                count++;
                count1++;
            }
            System.out.println();
            total1+=2;
            totalfspaces--;
            row++;
            count=1;
            
        }
    }
    public static void pattern27(int n)
    {
        int total1=1;
        int totalfspaces=5;
        int row=1;
        
        while(row<=n)
        {
            int count=1;
            int countspaces=1;
            while(countspaces<=totalfspaces)
            {
                System.out.print("\t");
                countspaces++;
            }
            int count1=1;
            while(count1<=total1)
            {
                System.out.print(count+"\t");
                if(count1<=total1/2  )
                {
                count++;
                }
                else{
                    count--;
                }
                count1++;
            }
            System.out.println();
            total1+=2;
            totalfspaces--;
            row++;
            
        }
    }
    public static void pattern28(int n)
    {
        int total1=1;
        int totalfspaces=5;
        int row=1;
        
        while(row<=n)
        {
            int count=row;
            int countspaces=1;
            while(countspaces<=totalfspaces)
            {
                System.out.print("\t");
                countspaces++;
            }
            int count1=1;
            while(count1<=total1)
            {
                System.out.print(count+"\t");
                if(count1<=total1/2  )
                {
                count++;
                }
                else{
                    count--;
                }
                count1++;
            }
            System.out.println();
            total1+=2;
            totalfspaces--;
            row++;
            
        }
    }
    public static void pattern29(int n)
    {
        int total1=1;
        int totalfspaces=5;
        int row=1;
        
        while(row<=n)
        {
            
            int countspaces=1;
            while(countspaces<=totalfspaces)
            {
                System.out.print("\t");
                countspaces++;
            }
            int count1=1;
            while(count1<=total1)
            {
                
                if(count1==1||count1==total1)
                {
                    System.out.print(row+"\t");
                
                }
                else{
                    System.out.print("0"+"\t");
                }
                count1++;
            }
            System.out.println();
            total1+=2;
            totalfspaces--;
            row++;
            
        }
    }
    public static void pattern30(int n)
    {

        int row=1;
        
        while(row<=n)
        {
            int count=5;
            while(count>=1)
            {
                System.out.print(count);
                count--;
            }
            System.out.println();
            row++;
            
        }
    }
     public static void pattern31(int n)
    {

        int row=1;
        
        while(row<=n)
        {   int number=5;
            int count=1;
            while(count<=n)
            {
                if(row+count==n+1)
                {
                    System.out.print("*");
                     number--;
                }
                else{
                System.out.print(number);
                number--;
            }
            count++;
            }
            System.out.println();
            row++;
            
        }
    }
    public static void pattern32(int n)
    {
        int row=1;
        int counter=row;
        int totalstr=1;
        while(row<=2*n-1)
        {
            int countstars=1;
            while(countstars<=totalstr)
            {
                if(countstars%2==0)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(counter);
                    
                }
                countstars++;

            }
            if(row<5)
            {
            totalstr+=2;
            }
            else{
                totalstr-=2;
            }
            System.out.println();
            if(row<5)
            {
                counter++;
            }  

            else 
            {
                counter--;
            }
            row++;
            
            
        }
    }
    public static void pattern33(int n)
    {
        int row=1;
        int totalspaces=9;
        int totalstr=1;
        int count=10;
        while(row<=n)
        {
            int countspace=1;
            while(countspace<=totalspaces&&countspace>0)
            {
                System.out.print(" ");
                countspace++;

            }
            int countstr=1;
            while(countstr<=totalstr)
            {

                System.out.print(count%10);
                if(countstr<=totalstr/2)
                {
                    count++;
                }
                else{                               
                    count--;
                }
                countstr++;

            }
            System.out.println();
            totalstr+=2;
            totalspaces--;
            row++;
        }
    }
    public static void main(String[] args) {
        pattern28(4);
        
    }
}