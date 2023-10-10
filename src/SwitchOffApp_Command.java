
public class SwitchOffApp_Command implements App_Command{
	
	String Uid;
	Appliance cur_Appliance;
	
	
	public void execute(String Uid, Appliance appliance) {
		this.Uid=Uid;
		this.cur_Appliance=appliance;
		appliance.swtchoff(Uid);
	}
	
	
	public String action(){
		 String action=this.Uid+"has switched off appliance"+ cur_Appliance.getid();
		 return action;
		}
	
}

