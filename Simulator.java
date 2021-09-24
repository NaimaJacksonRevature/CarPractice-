import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		System.out.println("WELCOME TO BUILD-A-CAR!, Please enter your engine rpm and mileage");
	    Scanner in = new Scanner(System.in);
	    int rpm = in.nextInt();
	    if(rpm < 500)
	    {
	    	rpm = 0;
	    	System.out.println("Please enter a number greater than 500");
	    }
	    Scanner on = new Scanner(System.in);
	    int mileage = on.nextInt();
	    if(mileage > 400000)
	    {
	    	mileage = 0;
	    	System.out.println("Please enter a number less than than 400,000");
	    }
	    System.out.println("Now, How many Gallons of Gas are in your car?");
	    Scanner gn = new Scanner(System.in);
	    int fuelGallons = gn.nextInt();
	    if(fuelGallons < 0)
	    {
	    	fuelGallons = 0;
	    	System.out.println("Please enter a number greater than than 0");
	    }
	    
	   
		Car tesla = new Car(rpm, mileage, fuelGallons);
		tesla.run();
		
		     gn.close();
		     on.close();
		     in.close();
		
	
	}
   
}
