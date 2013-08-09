package mikera.misc;
import java.util.Arrays;

import mikera.engine.*;
import mikera.util.Bits;


public class BitsTest {

	public static int returnLongMaskArray(long[] buffer, long value) {
		int count=0;
		while (value!=0) {
			long mask=value & (-value);
			value&=~mask;
			buffer[count++]=mask;
		}
		return count;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Bits.toBinaryString(Octreap.split3i(Integer.parseInt("1111100111",2))) );
		
		int a=3;
		for (int i=0; i<10; i++) {
			System.out.println(a);
			a=Bits.nextIntWithSameBitCount(a);
		}
		
		System.out.println(Bits.toBinaryString(Bits.nextIntWithSameBitCount(0x80000000)));
		
		System.out.println(encrypt(10,(byte)5));
		
		System.out.println(Integer.MAX_VALUE);
		
		long[] maskStuff=new long[64];
		System.out.println(returnLongMaskArray(maskStuff,-1));
		System.out.println(Arrays.toString(maskStuff));
	}
	
    public static long encrypt(int value, byte key) {
        int result=value;
        for (int i=0; i<=(key&255); i++) {
          result=Integer.rotateRight(result,7)^(i+0xCAFEBABE);
        } 
        return result;
    }

}
