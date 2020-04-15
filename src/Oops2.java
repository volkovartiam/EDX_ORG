import java.util.Scanner;

public class Oops2 {
    public static void main(String[] args) {

    	
    	Scanner in = new Scanner(System.in);  

		System.out.print("What color do you want? ")  ;
		
		String colour  =  in.nextLine()  ;
     	
		if ( colour.contentEquals("R")      || colour.contentEquals("r")  ) {
			System.out.println("You have chosen Red.");
		}	

		else if ( colour.contentEquals("G") || colour.contentEquals("g")  ) {
			System.out.println("You have chosen Green.");
		}	

		else if ( colour.contentEquals("B") || colour.contentEquals("b") ) {
			System.out.println("You have chosen Blue.");
		}	

		else {
			System.out.println("Unknown color: "  + colour);
		}
		
		in.close();		
    	
    	
    }	
    	
}  