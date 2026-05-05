import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int [] arr={40,10,0,100,80};
        int i;
        int small=arr[0];
        int n=arr.length;
          int k = 2;
          Arrays.sort(arr);
        for(i=0;i<n;i++){
        if (arr[i]<small){
            small=arr[i];
        }
            
        
        }
          System.out.println("samllest : " +small);
        System.out.println("elements in the array  : " +n);
         System.out.println(arr[k-1]);
    }
}
