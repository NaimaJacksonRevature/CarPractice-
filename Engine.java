
public class Engine extends CarPart implements ICarPart {
	
         
	   private int mileage;
	   private int rpm;
	   public Engine(int mileage, int rpm)
	   {
		  
		   this.mileage = mileage;
		   this.rpm = rpm;
	   }
	      
	     CarPart newEngine = new CarPart();  
          boolean running = true;
          String rpmStatement = "";
        

          
    public String partStatus()
    {
          if(newEngine.isPartOn(running))
          {
        	  if(rpm < 800 && rpm > 500)
        	  {
        		  rpmStatement = "Your engine is average" + "\n";
        	  }
        	  else if(rpm > 800 && rpm < 1300 )
        	  {
        		  rpmStatement = "Your engine is fast" + "\n";
        	  }
        	  else if(rpm > 1300)
        	  {
        		 rpmStatement =  "Your engine is superdy duper fast"  + "\n" ;
        	  }
          }
          rpm = this.rpm;
          return rpmStatement;
              
    }
    public int engineMileage(int mileage)
    {
    	if(newEngine.isPartOn(running))
    	{
    		mileage--;
    	}
    	 mileage = this.mileage;
    	return mileage;
    }
    
}
