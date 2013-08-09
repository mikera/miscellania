package mikera.misc;

public class ConstructurTest {

	private static class A {
		public A() {
			System.out.println("A created");
		}
	}
	
	private static class B extends A {
		public B() {
			this("hello");
			System.out.println("B created");
		}
		
		public B(String s) {
			System.out.println("B created: "+s);
		}
	}
	
	public static void main(String[] args) {
		new B();

	}

}
