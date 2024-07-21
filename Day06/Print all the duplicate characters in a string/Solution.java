
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String str = "test strings";
        printDuplicates(str);

    }

    public static void printDuplicates(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + ", count = " + entry.getValue());
                }
            }
        }

    }
}