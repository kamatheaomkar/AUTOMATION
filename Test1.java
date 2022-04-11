package exception;

public class Test1 {
public static void main(String[] args) {
//	int A=20;
// 	int B=0;
	
	
	try
	{
	//	int C=A/B;//Riskey code
	}

	catch(ArithmeticException F)
	{
	System.out.println("ArithmeticException handled");
    }
System.out.println("This is line after Arithmetic exception");
}
}