package mathAndLogic;

public class LinerSearch {

	public static void main(String[] args) {
		int [] array = {23,43,232,134,354,8};
		int search = 0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==search) {
				System.out.println("Your element is found at index "+i);
				return;
			}
		}
		System.out.println("Not found");
		
		
		// Type conversion - String to integer/double/float etc
		
//		String convert = "Arijit";
//		int number = 100 * Integer.parseInt(convert);
//		System.out.println(number);
		
		// Type conversion - int/double/float to String etc
		
//		int number = 10;
//		String convert = String.valueOf(number);
//		System.out.println(convert);
//		
	}
	


}
