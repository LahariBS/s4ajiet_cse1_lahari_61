import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int minRank = sc.nextInt(); 
        int cuts = 0;
        for (int i = 1; i < n; i++) {
            int rank = sc.nextInt();

            if (rank < minRank) {
                cuts++;
                minRank = rank;
            }
        }
        System.out.println(cuts);
    }
}
