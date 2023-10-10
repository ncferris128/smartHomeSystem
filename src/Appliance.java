
public abstract class Appliance {

	String applianceID;
	private boolean power; 
	public Appliance() {
	}
	public Appliance(String id) {
		this.applianceID=id;
		this.setPower(false);
	}
	public void swtchon(String uid) {
		this.power=true;
	}

	public String getid() {	
		return this.applianceID;
	}

	public void swtchoff(String uid) {
		
		this.power=false;
		System.out.print(uid+ "has switched off appliance "+ this.getid());
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	public abstract void operate();
}
