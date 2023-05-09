

interface Panel{
	void turnOnOff();
	void increaseTemp();
	void decreaseTemp();
	void swingOnOff();
}

class VendorOneMotherboard implements Panel{
	  boolean currentStatus= false;
	   int minTemp = 16;
	   int maxTemp =32;
	    int currentTemp = 28;
	@Override
	public void turnOnOff() {
		
		  if(currentStatus ==false) {
			  System.out.println("AC Turned On");
			  currentStatus = true;
		  }
		  else {
			  System.out.println("AC Turned OFF");
			  currentStatus = false;
		  }
	}
	@Override
	public void increaseTemp() {
		// TODO Auto-generated method stub
		
		if(currentStatus == true) {
			if(currentTemp < maxTemp) { // 32 < 32
				currentTemp++;
				System.out.println(currentTemp);
			}
			else {
				System.out.println("Max Temp Reached");
			}
		}
		else {
			System.out.println("turn on the AC First");
		}
		
		
	}
	@Override
	public void decreaseTemp() {
		
		if(currentStatus == true) {
			if(currentTemp < maxTemp && currentTemp > minTemp) { 
				currentTemp--;
				System.out.println(currentTemp);
			}
			else {
				System.out.println("Min Temp Reached");
			}
		}
		else {
			System.out.println("turn on the AC First");
		}
		
		
	}
	@Override
	public void swingOnOff() {
		// TODO Auto-generated method stub
		
	}	
}

class VendorTwoMotherBoard implements Panel{

	@Override
	public void turnOnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseTemp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseTemp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swingOnOff() {
		// TODO Auto-generated method stub
		
	}
	
}

public class RemoteDemo {
	
	public static void main(String[] args) {
		Panel panel = new VendorOneMotherboard();
		panel.turnOnOff();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        panel.decreaseTemp();
        
	}

}
