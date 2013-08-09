package mikera.misc;

public class TestTimers {
	  public static void main (String[] args) {
	    final long sleepMillis = 5000;

	    long nanosBefore = System.nanoTime();
	    long millisBefore = System.currentTimeMillis();

	    try {
			Thread.sleep(sleepMillis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    long nanosTaken = System.nanoTime() - nanosBefore;
	    long millisTaken = System.currentTimeMillis() - millisBefore;

	    System.out.println("nanosTaken="+nanosTaken);
	    System.out.println("millisTaken="+millisTaken);

	  }

}
