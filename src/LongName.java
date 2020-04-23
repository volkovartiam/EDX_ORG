
import java.util.Scanner;

public class LongName {

	public static void main(String[] args) {

		
//		String str1 = "Frodo Baggins" ;
		String str1 = "Q.E.D." ;
		
	//	String str2 = "Gandalf the GRAY" ;
		String str2 = "Arcturan Megadonkey" ;	
		
		String str3 = "Sirius Cybernetics Corporation" ;
		
/*		System.out.println( str1.length()  );		

		System.out.println( str1.charAt(7)  );		
		System.out.println( str2.charAt(0)  );		
*/
		System.out.println( str2.substring(10, 14)  );			
		System.out.println( str3.substring(9, str3.indexOf("e")) ) ;		


		System.out.println( str2.toLowerCase().substring(9, 13) + str3.substring(18, str3.length() - 7)  ) ;	
	}
/*		
		int x = 1;
		int y = 2;
		int z = 3;
		
		z = mystery( x, z, y ) ;
		System.out.println( x + " " + y + " "  +  z );
		x = mystery( z, z, x ) ;
		System.out.println( x + " " + y + " "  +  z );
		y = mystery( y, y, z ) ;
		System.out.println( x + " " + y + " "  +  z );
		
	}
		
		public static int mystery(int z, int x, int y ) {
			z-- ;
			x = 2 * y + z ;
			y = x - 1 ; 
		
			System.out.println(y +  " " + z ) ;	
			return x ;
		}
		
*/		
		
		
		
//		printStrings("123", 2 ) ; 
		
//	}
//		Scanner console = new Scanner (System.in);
	//	longestName(console, 3) ;
	
/*		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print(i);
			  }
			System.out.println();
		}
*/
	
/*		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10 ; j++) {
				for (int x =0; x < 3; x++) {
					System.out.print(j);
				}	
			}
			System.out.println();
		}	
*/		
		
		
	public static void  printStrings( String str , int number ) {	
	
		for (int i = 1; i <=number; i++ ) {
			System.out.print(str);			
		}
	}

	public static void  longestName( Scanner in , int number ) {
	

		String s = "0" ;
		int maxLetter = 0 ; 
		int numberOfLetter = 0 ; 
		boolean itsRepeated = false ;
		String out = "0" ;
		
		
		for (int i=0; i< number; i++ ) {
		
			System.out.print("name #" +  (i + 1) + "? " ) ;
			s = in.next() ;

			numberOfLetter = s.length() ;
			
			if (numberOfLetter ==  maxLetter)  {
					itsRepeated =  true ;
			}			
			
			if ( numberOfLetter >  maxLetter ) {
				maxLetter = numberOfLetter;
				itsRepeated =  false ;
				out = s ;
			}
		}
		
		String buf = out ;
		String out_1 = out.substring(0 , 1).toUpperCase() ;
		String out_2 = buf.substring(1 ).toLowerCase() ;

		out = out_1 + out_2 ;	
		
		System.out.println(  out  +  "'s name is longest" ) ;
		
		if (itsRepeated) {
			System.out.println("(There was a tie!)" ) ;
		}
		
	}		


}


