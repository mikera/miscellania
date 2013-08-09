package mikera.misc;
import mikera.util.*;


public class IntVectorTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int X=3;
		int[] Y={1,2,3,4,5,6,7,8};
		
		int result=0;
		int i=0;   
	   
		for ( int x=X; x!=0; x>>=4 ){
	        switch (x&15) {
	        	case 0: break;
	        	case 1: result+=Y[0]; break;
	        	case 2: result+=Y[1]; break;
	        	case 3: result+=Y[0]+Y[1]; break;
	        	case 4: result+=Y[2]; break;
	        	case 5: result+=Y[0]+Y[2]; break;
	        	case 6: result+=Y[1]+Y[2]; break;
	        	case 7: result+=Y[0]+Y[1]+Y[2]; break;
	        	case 8: result+=Y[3]; break;
	        	case 9: result+=Y[0]+Y[3]; break;
	        	case 10: result+=Y[1]+Y[3]; break;
	        	case 11: result+=Y[0]+Y[1]+Y[3]; break;
	        	case 12: result+=Y[2]+Y[3]; break;
	        	case 13: result+=Y[0]+Y[2]+Y[3]; break;
	        	case 14: result+=Y[1]+Y[2]+Y[3]; break;
	        	case 15: result+=Y[0]+Y[1]+Y[2]+Y[3]; break;
	        }
	        i+=4;
	    }
	
	    System.out.println(result);
	}
}
