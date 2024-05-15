package innerClassAndLambda;

class A {
	public void display() {
		System.out.println("In A outer class class");
	}

}

public class InnerClass {

	public static void main(String[] args) {
		A obj = new A() {
			public void display() {
				System.out.println("In A inner class");
			}
		};
		obj.display();

	}

}
