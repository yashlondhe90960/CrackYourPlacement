

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        dfs(n, n, "", res);
        return res;

    }

    void dfs(int left, int right, String out, List<String> res) {
        if (left < 0 || right < 0 || left > right)
            return;
        if (left == 0 && right == 0) {
            res.add(out);
            return;
        }
        dfs(left - 1, right, out + "(", res);
        dfs(left, right - 1, out + ")", res);

    }

}