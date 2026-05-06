import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> cse = new LinkedList<>();

        cse.add(1);
        cse.add(7);
        cse.add(80);
        cse.add(90);
        cse.add(78);
        cse.addFirst(5);
        cse.addLast(6);
        
        
        cse.removeFirst();
         cse.removeLast();
         cse.remove(2);
         
         cse.getFirst();
         cse.getLast();
        System.out.println(cse.get(0));
        System.out.println("Before clear: " + cse);

cse.clear();

System.out.println("After clear: " + cse);
        
       
        System.out.println(cse);
    }
}
