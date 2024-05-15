package mathAndLogic;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123;
		int revNumber = 0;
		System.out.println("Before reverse " + number);
		while (number > 0) {
			int rem = number % 10;
			revNumber = revNumber* 10 + rem ;
			number = number / 10;
		}

		System.out.println("After reverse " + revNumber);
	}

}
