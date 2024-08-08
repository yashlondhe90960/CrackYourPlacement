class Solution {
    // Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S) {
        // Your code here
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < S.length(); ++i) {
            char c = S.charAt(i);

            if (Character.isDigit(c)) {
                st.push(c - '0');
            } else {
                int val1 = st.pop();
                int val2 = st.pop();

                switch (c) {
                    case '+':
                        st.push(val1 + val2);
                        break;
                    case '-':
                        st.push(val2 - val1);
                        break;
                    case '*':
                        st.push(val2 * val1);
                        break;
                    case '/':
                        st.push(val2 / val1);
                        break;

                }
            }

        }
        return st.pop();

    }
}