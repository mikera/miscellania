package mikera.misc;
import mikera.util.Maths;


public class TestSigmoid {
	public static void main(String[] args) {
		for (int i=-50000; i<50000; i+=50) {
			System.out.println(i+": "+Maths.logistic(i));
		}
		
		System.out.println(Float.isNaN(Float.POSITIVE_INFINITY));

	}
}
