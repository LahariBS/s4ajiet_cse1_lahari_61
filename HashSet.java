

import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
	    
	    HashSet<Integer>cse=new HashSet < > ( );
	    cse.add(2);
	    cse.add(20);
	    cse.add(2);
	    cse.add(3);
	    cse.remove(3);
	    
	    cse.contains("lahari");
	  System.out.println("lahari is consist or not: "+cse.contains("lahari"));
	   System.out.println("size is "+cse.size());

		System.out.println("total element: "+cse);
 	System.out.println("Before clear: " + cse);

     cse.clear();

     System.out.println("After clear: " + cse);

	}
}



