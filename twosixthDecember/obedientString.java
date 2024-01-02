package twosixthDecember;

public class obedientString {
    public static void main(String[] args) {
        generateString("abba", "a");
        
    }
    public static void generateString(String original,String current)

    {
        if(!original.startsWith(current))
        {
            return;
        }
        if(original.equals(current))
        {
            System.out.println("hello");
            return;
        }
        if(current.length()>original.length())
        {
            return;
        }
        if(current.endsWith("a"))
        {
            generateString(original, current+"a");
            generateString(original, current+"bb");
        }
        else if(current.endsWith("bb"))
        {
            generateString(original, current+"a");
        }

    }
    
}
