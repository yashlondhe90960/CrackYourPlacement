class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for (int x : arr) {
            if (st.isEmpty() || st.peek() >= x) {
                st.push(x);

            } else {
                while (!st.isEmpty() && st.peek() < x) {
                    int cur = st.pop();
                    if (st.isEmpty() || st.peek() >= x) {
                        count += cur * x;
                    } else {
                        count += cur * st.peek();
                    }
                }
                st.push(x);
            }
        }

        while (st.size() > 1) {
            count += st.pop() * st.peek();
        }
        return count;
    }
}