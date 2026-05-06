import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Character, Integer> k = new HashMap<>();

        String s = "college";

        for (char c : s.toCharArray()) {
            if (k.containsKey(c)) {
                k.put(c, k.get(c) + 1);
            } else {
                k.put(c, 1);
            }
        }

        for (char c1 : k.keySet()) {
            if (k.get(c1) > 1) {
                System.out.println(c1 + " -> " + k.get(c1));
            }
        }
    }
}
