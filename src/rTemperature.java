
public class rTemperature implements AutoRegulate{

	private double current_temp;;
	private double set_temp; 

	public rTemperature() {
		this.current_temp=25;
		this.set_temp=25;
	}
	
	public void regulate() {
		if(senseChange()==true) {
			this.rProcessOn();
		}
		else {
			this.rProcessOff();
		}
		regulate();
	}


	public boolean senseChange() {
		if(this.current_temp!=25) {
			return true;
		}
		else {
			return false;
		}
	}

	public void rProcessOn() {
		double change= 25-this.current_temp;
		this.set_temp += change;   
		
	}

	public void rProcessOff() {
		this.set_temp=25;		
	}
	
}
