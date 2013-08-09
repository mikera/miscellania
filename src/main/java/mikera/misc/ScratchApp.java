package mikera.misc;
import mikera.persistent.impl.Tuple;


public class ScratchApp {

	private static <T> void printArrayType(T[] stuff) {
		System.out.println(stuff.getClass().getComponentType());
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	private static <T> T[] getArray(T b) {
		return (T[]) new Object[] {b};
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object o=3;
		
		System.out.println(o.equals(3));

		printArrayType(new Integer[] {1,2,3,4});
		
		Object[] os=Tuple.create(new Integer(3)).data;
		
		System.out.println(os.getClass().getComponentType());
	}

}
