import java.util.Scanner;

public class Days {

	
    public static void main(String[] args) {

    	System.out.println( daysInMonth (1) );
       	System.out.println( daysInMonth (2) );
       	System.out.println( daysInMonth (4) );
        
    	
    }
	
	public static int daysInMonth( int m  ) {
		
    	int month = m ;  
    	int day = 1 ;
    	
    	if (month == 1  ||  month == 3 ||  month == 5 ||  month == 7 ||  month == 8 ||  month == 10 ||  month == 12 ) {
			day = 31;

			//    		System.out.println("31");
		}	
    	else if (month == 2 ) {
			day = 28;

			//			System.out.println("28");
		}	

    	else if (month == 4  ||  month == 6 ||  month == 9 ||  month == 11 ) {
			day = 30;

    		//			System.out.println("30");
		}	
		return day ;
	}		

	
}
