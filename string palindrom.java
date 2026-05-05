import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
