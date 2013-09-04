package mikera;

class TestTypes {

	public interface A {}
	public interface B {}

	public static class C implements A, B {}
	public static class D {
		public String m(A a) { return "A"; }
		public String m(B b) { return "B"; }
		public String m(Object b) { return "O"; }
	}
	public static void main(String[] args) {
		C c=new C();
		
		// new D().m(c);
		
		System.out.println(new D().m((A)new C()));
		System.out.println(new D().m((B)new C()));
		System.out.println(new D().m((Object)new C()));
		// System.out.println(new D().m(new C()));
	}
}
