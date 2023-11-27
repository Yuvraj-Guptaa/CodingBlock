  package Basics;
  
  class printprimeno {
    public static void main(String[] args) {
        int n = 50; // Change this value to the desired upper limit
        System.out.println("Prime numbers between 2 and " + n + ":");
        
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}