package LambdaAndStreaApi;

public class Test {
	
	private int num= 10;
	private int age = 23;
	
	public Test(int num,int age) {
		this.num= num;
		this.age = age;
	}
	public Test() {
		
	}

	public static void main(String[] args) {
		
		
		Test test = new Test();
		System.out.println(test.age);
		
		

	}

}
