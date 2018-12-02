public class Knapsack1 {
    //用[0... index ]的物品,填充容积为c的背包的最大价值
    int[][] memo;

    private int bestValue(int[] w, int[] v, int index, int C) {

        if (index < 0 || C <= 0) {
            return 0;
        }
        if (memo[index][C] != 0) {
            return memo[index][C];

        }
        int res = bestValue(w, v, index - 1, C);
        if (C >= w[index]) {
            res =  Math.max(res,v[index] + bestValue(w, v, index - 1, C - w[index]));
        }
        return res;
    }
    int Knapsack01(int[] w,int [] v, int C){
        int n = w.length;
        memo = new int[n][C];
        return bestValue(w, v, n - 1, C);
    }
}
