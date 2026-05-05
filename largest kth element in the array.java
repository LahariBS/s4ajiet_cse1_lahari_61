import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int [] arr={40,10,0,100,80};
        int i;
        int large=arr[0];
        int n=arr.length;
          int k = 2;
          Arrays.sort(arr);
        for(i=0;i<n;i++){
        if (arr[i]>large){
            large=arr[i];
        }
            
        
        }
          System.out.println("largest : " + large);
        System.out.println("elements in the array  : " +n);
         System.out.println(arr[n - k]);
    }
}
