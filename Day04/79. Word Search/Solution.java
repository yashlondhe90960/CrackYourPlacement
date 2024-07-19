public class Solution {

    int m;
    int n;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        boolean result = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return result;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int wordPos) {

        if (wordPos == word.length()) {
            return true;
        }

        // @note: here, return check can remove the boundary check in each recursion,
        // nice!
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(wordPos)) {
            return false;
        }

        char temp = board[i][j];

        board[i][j] = '#';

        boolean result = (dfs(board, word, i - 1, j, wordPos + 1)
                || dfs(board, word, i + 1, j, wordPos + 1)
                || dfs(board, word, i, j - 1, wordPos + 1)
                || dfs(board, word, i, j + 1, wordPos + 1));

        // restore from `#`
        board[i][j] = temp;

        return result;
    }
}