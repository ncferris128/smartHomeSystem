
public class rLight implements AutoRegulate{

	private boolean pass;
	private boolean brightness; 

	public rLight() {
		this.pass=false;
		this.brightness=false;
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
		if(pass==true) {
			return true;
		}
		else {
			return false;
		}
	}

	public void rProcessOn() {
		this.brightness=true;
	}

	public void rProcessOff() {
		this.brightness=false;
	}

}
