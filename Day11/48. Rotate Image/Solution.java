class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // swapping
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        // reverse

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;

            }
        }

        // int[][] dummy = new int[n][n];
        // for(int i=0;i<n;i++){

        // for(int j=0;j<n;j++){
        // dummy[i][n-j-1] = matrix[i][j];
        // }
        // }

    }
}