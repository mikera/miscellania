package mikera.misc;

public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] res=new String[101];
		
		for (int i=1; i<=100; i++) res[i]="";
		
		for (int i=3; i<=100; i+=3) res[i]+="Fizz";
		for (int i=5; i<=100; i+=5) res[i]+="Buzz";

		for (int i=1; i<=100; i++) {
			if (res[i].equals("")) res[i]=Integer.toString(i);
		}

		for (int i=1; i<=100; i++) {
			System.out.println(res[i]);
		}
	}

}
