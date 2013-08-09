package mikera.misc;

public class TestXXX {
	public static class MyString{
	    //Data:
	    private char[] theString;
	    //constructors:
	    public MyString(){ // default constructor
	    }
	    public MyString(String s){ // parameterized constructor
	    }
	    public MyString(char[] s){ // parameterized constructor
	    }
	    public MyString(MyString s){ // copy constructor
	    }
	    //A method that calls a constructor:
	    public MyString foobar(){
	        return new MyString(theString);
	    }
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		char[] as="ghuo".toCharArray();
		
		MyString b=new MyString((String)null);
		
		MyString a= new MyString(as);
		a.foobar();
	}
}
