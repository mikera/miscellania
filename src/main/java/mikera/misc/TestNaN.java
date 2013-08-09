package mikera.misc;
import java.math.BigInteger;


public class TestNaN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0.0!=Double.NaN);
		System.out.println(1.0/Double.NaN);
		
		System.out.println((double)Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(1000/Double.MIN_VALUE);
		
		System.out.println((double)(new BigInteger("100000000000000000000000000000000000000").doubleValue()));
	}

}
