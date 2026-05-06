import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

   HashMap<Integer ,String> cse = new HashMap<>();

        cse.put(101,"lahari");
        cse.put(102,"lavanya");
        cse.put(103,"mithesh");
        cse.put(104,"sujju");
         System.out.println("total element before remove: " + cse);
         

         System.out.println(" removed :"  + cse.remove(104));

        System.out.println("to get the value: " + cse.get(102));
        
        System.out.println(" after remove the size is " + cse.size());
        System.out.println("total element: " + cse);

        System.out.println("Before clear: " + cse);

        cse.clear();

        System.out.println("After clear: " + cse);
    }
}
