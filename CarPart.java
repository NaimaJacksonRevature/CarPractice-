
public class CarPart implements ICarPart {
      private boolean onOrOff = true;
      String partResponse ="";
      public String partStatus() {
    	  return partResponse;
      };
      
      public boolean isPartOn(boolean onOrOff)
      {
    	  onOrOff = this.onOrOff;
    	  return onOrOff;
      }
     
}
