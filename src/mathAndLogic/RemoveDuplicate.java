package mathAndLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,1,2,3,4,5);
		
		for(int i=0;i<list.size()-1;i++) {
			for(int j=1;j<list.size()-1;j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
				}
				
			}
		}
		System.out.println(list);
		

	}

}
