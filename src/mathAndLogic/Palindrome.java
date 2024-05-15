package mathAndLogic;

public class Palindrome {

	public static void main(String[] args) {
		int number = 1211;
		int temp=number;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum= sum*10 + rem;
			temp=temp/10;	
		}
		if(sum==number) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		String name="Mummy";
		StringBuilder newName = new StringBuilder(name);
		StringBuilder reverseName = newName.reverse();
		
	     if(newName.toString().equals(reverseName.toString())) {
	    	 System.out.println("this string is palindrome");
	     }else
	    	System.out.println("NOt a palindrome string");
		

	}

}
