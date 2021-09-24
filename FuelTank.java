
public class FuelTank extends CarPart implements ICarPart {
 private int fuelGallons = 0;
 public FuelTank(int fuelGallons)
 {
	 this.fuelGallons = fuelGallons;
 }
 boolean running = true;
 String howLongTilEmpty = "";
 CarPart fueltank = new CarPart();
 public String partStatus()
 {
	 if(fuelGallons > 0 && fueltank.isPartOn(running)) 
	 {
		int fuelMiles =fuelGallons * 11 ;
		fuelGallons--;
	 if(fuelGallons > 1 && fuelGallons < 25)
	 {
		 howLongTilEmpty = "You are very close to Empty! ;( " + "\n"+  fuelMiles + "  miles "  + "\n"+  fuelGallons + " gallons";
	 }
	 else  if(fuelGallons > 25 && fuelGallons < 50)
	 {
		 howLongTilEmpty = "You are about half way to Empty! :/ " + "\n"+  fuelMiles + " miles " + "\n"+ fuelGallons + " gallons";
	 }
	 else  if(fuelGallons > 50 && fuelGallons < 100)
	 {
		 howLongTilEmpty = "You are very close to Full! :) " + "\n"+  fuelMiles + " miles "  + "\n"+  fuelGallons + " gallons";
	 }
	 }
	 return howLongTilEmpty;
 }
}
