public class Main {
    public static void main(String[] args) {
        String str = "Hello   World\tJava";
        
        String result = str.replaceAll("\\s", "");
        
        System.out.println(result);
    }
}
