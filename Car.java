
import java.util.ArrayList;
public class Car{
	
	private static ArrayList<String> carParts = new ArrayList<String>();
	
	public Car(int mileage, int rpm, int fuelGallons)
    {
    	Engine newEngine = new Engine(mileage, rpm);
    	FuelTank newFuelTank = new FuelTank(fuelGallons);
    	carParts.add(newEngine.partStatus());
    	carParts.add(newFuelTank.partStatus());
    }
	public void run() {
		
		for(int i = 0; i < carParts.size() ;i++)
		{
		  System.out.println(carParts);
		}
	
    }
}
