class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;

        int maxProfit = 0;
        // TLE
        // for(int i=0;i<n;i++){
        // for(int j=i+1; j<n;j++){
        // if(arr[j] > arr[i]){
        // maxProfit = Math.max(arr[j] - arr[i], maxProfit);

        // }
        // }
        // }
        // return maxProfit;

        // int minPrice = Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        // minPrice = Math.min(minPrice, arr[i]);
        // maxProfit = Math.max(maxProfit, arr[i] - minPrice);

        // }
        // return maxProfit;

        int buy = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= buy)
                profit = Math.max(profit, arr[i] - buy);
            else
                buy = Math.min(buy, arr[i]);
        }
        return profit;

    }
}

