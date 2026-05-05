import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int [] arr={40,10,0,100,80};
        int i;
        int large=arr[0];
        int n=arr.length;
        for(i=1;i<arr.length;i++){
        if (arr[i]>large){
            large=arr[i];
              System.out.println("largest :" + large);
        }
        }
        System.out.println("elements in the array" +arr.length);
    }
}
