package thread;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class IterateListSet {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		Set<String> colleage = new HashSet<>();

		name.add("Arijit");
		name.add("Bisahl");
		name.add("Vivek");

		// 1 way
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		// 2 way
		for (String naam : name) {
			System.out.println(naam);
		}
		//3 way
	       Iterator<String> newName= name.iterator();
	       while(newName.hasNext()) {
	    	   String friend = newName.next();
	    	   System.out.println(friend);
	       }
	    //4 way
	       name.forEach(names->System.out.println(names));
	       
	       
	}
	
	
	

}
