class Main {
    public static void main(String[] args) {
        int[] arr ={4,5,1,2,3};
        int i;
        int s=arr[0];
        int l=arr[0];
        int n=arr.length;
        System.out.println("length of the arrray");
        for (i=0;i<arr.length;i++){
              System.out.println(arr[i]);
            if(arr[i]<s){
                s=arr[i];
            }
            if(arr[i]>l){
                l=arr[i];
            }
            }
             System.out.println("smallest   : "+s);
              System.out.println("largest   : "+l);
              
