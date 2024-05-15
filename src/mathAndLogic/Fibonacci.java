package mathAndLogic;

public class Fibonacci {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		int n = 10;
		int previousSum = first + second;
		System.out.print(first + " ");
		System.out.print(second + " ");
		System.out.print(previousSum + " ");

		for (int i = 4; i <= n; i++) {
			first = second;
			second = previousSum;
			int newSum = first + second;
			previousSum = newSum;

			System.out.print(newSum + " ");

		}

	}

}
