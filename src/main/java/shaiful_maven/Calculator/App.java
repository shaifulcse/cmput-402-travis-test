package shaiful_maven.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public int add(int x, int y) {
    	
    	return x+y;
    }
    
    public int multiply(int x, int y) {
    	
    	return x*y;
    }

    public int division(int x, int y) {
    	
    	return x*y;// intentional mistake
    }
	
    public int subtraction(int x, int y) {
    	int a=5; //intentional
    	return x-y;
    }	
}
