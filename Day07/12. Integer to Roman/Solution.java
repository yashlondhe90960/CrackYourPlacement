class Solution {
    private final int[] val = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private final String[] sym = { "M", "CM", "D", "CD", "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I" };

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (num > 0) {
            while (num >= val[i]) {
                num -= val[i];
                result.append(sym[i]);
            }
            i++;
        }
        return result.toString();
    }
}