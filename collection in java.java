

import java.util.ArrayList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
	    
	    ArrayList<String>cse=new ArrayList < > ( );
	    cse.add("ada");
	    cse.add("maths");
	    cse.add("lavanya");
	    cse.add(1,"amma");
	    cse.set(0,"lahari");
	    cse.remove(3);
	    Collections.sort(cse);
	    Collections.sort(cse,Collections.reverseOrder());
	 
	   System.out.println(cse.size());
		System.out.println(cse.get(0));
		System.out.println(cse);

	}
}



