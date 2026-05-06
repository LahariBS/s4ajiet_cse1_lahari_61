public class Main {
    public static void main(String[] args) {

        String input = "hello world  javaa";
        StringBuilder k = new StringBuilder();

        for (char j : input.toCharArray()) {
            if (!Character.isWhitespace(j)) {
                k.append(j);
            }
        }

        String m = k.toString();
        System.out.println(m);
    }
}
