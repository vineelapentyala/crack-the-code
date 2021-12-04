public class TripleStep {
    public int tripleStep(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 0; i <= n; i++){
            if (i == 0){
                dp[i] = 1;
            }
            if (i == 1){
                dp[i] = 1;
            }
            if (i == 2){
                dp[i] = 2;
            }
            if (i == 3){
                dp[i] = 4;
            }
            else{
                dp[i] = dp[i-1] + dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
}
