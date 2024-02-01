package Dynamic;

public class basic_DP {
    public static void main(String[] args) {
        // System.out.println(Fibo(4));
        int n = 6900;
        System.out.println(FiboDP(n, new Integer[n + 1]));
    }

    public static int Fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int sp1 = Fibo(n - 1);
        int sp2 = Fibo(n - 2);
        return sp1 + sp2;
    }

    public static int FiboDP(int n, Integer[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != null) {
            return dp[n];
        }
        int sp1 = FiboDP(n - 1, dp);
        int sp2 = FiboDP(n - 2, dp);
        ///////////////////////
        // Store your solution
        dp[n] = sp1 + sp2;
        //////////////////////
        return sp1 + sp2;
    }

    public static int FiboBU(int N) {
        // S1 : Take Biggest Problem as your input arguments
        // S2 : DS!! DO NOT THINIK ABOUT THE SIZE!!
        // S7 : Final size of your DP array!!
        int[] dp = new int[N + 1];
        // S3 : Loop!! => always!! smallest to biggest problem!!
        for (int n = 0; n <= N; n++) {
            // FIbo (n)!! => dp[n]
            // Step 4: calculate Fibo(n)

            // Step 5 : Base Case!!
            if (n <= 1) {
                dp[n] = n;
                continue;
            }
            int sp1 = dp[n - 1];
            int sp2 = dp[n - 2];
            dp[n] = sp1 + sp2;
        }
        // Step 6!! return Biggest Problem!!
        return dp[N];
    }

    public static int climbStair(int curr, int n) {
        if (n == curr) {
            return 1;
        }
        if (curr > n) {
            return 0;
        }
        int sp1 = climbStair(curr + 1, n);
        int sp2 = climbStair(curr + 2, n);
        return sp1 + sp2;
    }

    public static int climbStairTD(int curr, int n, Integer[] dp) {
        if (n == curr) {
            return 1;
        }
        if (curr > n) {
            return 0;
        }
        if (dp[curr] != null) {
            return dp[curr];
        }
        int sp1 = climbStairTD(curr + 1, n, dp);
        int sp2 = climbStairTD(curr + 2, n, dp);

        dp[curr] = sp1 + sp2; // stored!!

        return sp1 + sp2;
    }

    public static int CS(int N){
        int[] dp = new int[N+3];

        for(int curr = N;curr>=0;curr--){
            // dp[curr]!!
            if (N == curr) {
                dp[curr]= 1;
                continue;
            }
           
            
            int sp1 = dp[curr + 1];
            int sp2 = dp[curr + 2];
    
            dp[curr] = sp1 + sp2; // stored!!
    
        }
        return dp[0] ;    }

}