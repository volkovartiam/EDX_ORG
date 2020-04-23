import java.io.* ;

public class Ex12_1 {

	public static void main (String[] args ) {
		
		int  x  = 2;
		String s = "" ;
		
		s = starString(x) ;
		System.out.println( s );
		
	}

	
	public static  String  starString (int n)  {
		int x = twoDegrees(n) ;
		String s = nSymbol(x) ;
		return s;
				
	}
	
	public static String nSymbol (int n) {
		int x = n;
		String sym  = "*" ; 
		String s = "";
		while (x > 0 ) {
			s = s + sym  ;
			x--;
		}
		return s;
	}
	
	public static int twoDegrees (int n) throws IllegalArgumentException {
		int x = n ;
		
		if (x < 0 ) {
			throw new IllegalArgumentException ( /*"Its can't be negative"*/) ;
		}
		else if (n == 0) {
			return 1 ;
		}
		else {
			return  (2 * twoDegrees(n-1) ) ;
		}
		
	}
		
}
