package stringQuestions;

public class checkChar {

	public static void main(String[] args) {
		
		String name = "Ashish";
		char[] array = name.toCharArray();
		
		for(int i=0;i<array.length;i++) {
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
				}
			}
			if(count>=2) {
				System.out.println(array[i]+" "+count+" times");
			}
		}
	}

}
//I did this :)
                