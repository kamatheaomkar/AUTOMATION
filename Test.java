package exception;

public class Test {
	

	public static void main(String[] args) {
		
	//	String s = null;
		
		try
		{
	//		System.out.println(s.length());//riskey code
		}
		catch(NullPointerException A)
		{		
		System.out.println("NullPointerException handled");
		}
		System.out.println("line after riskey code");
	}

}
