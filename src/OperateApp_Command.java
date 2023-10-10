
public class OperateApp_Command implements App_Command{

	String Uid;
	Appliance cur_Appliance;
	
	
	public String action(){
		 String action=this.Uid+"has switchon/off/operate "+ cur_Appliance.getid() +"appliance.";
		 return action;
		}
	
	public void execute(String Uid, Appliance appliance) {
		this.Uid=Uid;
		this.cur_Appliance=appliance;
		appliance.swtchoff(Uid);
	}

}
