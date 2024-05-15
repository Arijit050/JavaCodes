

package mathAndLogic;

import java.util.Arrays;

public class CountCharInName {

	public static void main(String[] args) {
		String name = "Arijit";
		int[]countArr=new int[name.length()];
		
		int count=1;
		for(int i =0;i<name.length();i++) {
			if(name.charAt(i)==name.charAt(i+1)) {
				count++;
				countArr[i-1]=count;
			}else {
				countArr[i-1]=count;
			}
		}
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i)+" appears "+countArr[i]+ " times");
		}
		
//		char[] charArray = name.toCharArray();
//		
//		Arrays.sort(charArray);
//		
//		String sortedName = new String(charArray);
//		System.out.println(sortedName);
//		
//		int count = 1;
//		for(int i = 1; i < sortedName.length(); i++) {
//			if(sortedName.charAt(i) == sortedName.charAt(i - 1)) {
//				count++;
//			} else {
//				System.out.println(sortedName.charAt(i - 1) + " appears " + count + " times");
//				count = 1;
//			}
//		}
//		System.out.println(sortedName.charAt(sortedName.length() - 1) + " appears " + count + " times");
	}
}


