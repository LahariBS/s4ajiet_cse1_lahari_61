import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int [] arr={40,10,0,100,80};
        int i;
        int small=arr[0];
        int n=arr.length;
        for(i=1;i<arr.length;i++){
        if (arr[i]<small){
            small=arr[i];
        }
            
        
        }
          System.out.println("smallest :" + small);
        System.out.println("elements in the array" +arr.length);
    }
}
