public class Main {
    public static void main(String[] args) {
        String str = "lahari";
        String result = "";

        for (char ch : str.toCharArray()) {
            result += (int) ch;
        }

        System.out.println(result);
    }
}
