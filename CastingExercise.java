package Knightingale;

public class CastingExercise {
   //Don't run this program - Just type and understanding how casting works
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    byte b=10;
    
    int i=b;// will accept - automatic type promotion
    
    byte c=i;// will not accpet - because lower type cannot be put in higher
    
    byte x=10;
    byte y=20;
    
    byte sum=x*y; //Error is thrown because when two bytes are used in a 
    // arthmetic operation, the result will be integer
	}

}
