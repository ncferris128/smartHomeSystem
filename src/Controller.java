import java.util.ArrayList;

public class Controller implements BasicControl, WorkerControl, ManagerControl {
	private static Controller SmartOffice;
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Appliance> appliances=new ArrayList<Appliance>();
	private ArrayList<App_Command> commands= new ArrayList<App_Command>();
	private RegisterAppliancesFactory RegisterAppliance=new RegisterAppliancesFactory();
	private RegisterUsersFactory RegisterUser = new RegisterUsersFactory();
	private Controller() {	}
	public static Controller getInstance() {
		if(SmartOffice==null) {
			SmartOffice=new Controller();
		}
		return SmartOffice;
	}
	
	public void checkcommandhistory(){
		int size=commands.size();
		for(int i=0; i<=size-1;i++){
			int num=i+1;
			App_Command c = commands.get(i);
			System.out.print("Index "+ num + c.action());
		}
	}
	
	public void store_and_execute(String Uid, Appliance appliance, App_Command cmd) {
		this.commands.add(cmd);
		cmd.execute(Uid, appliance);
	}
	@Override
	public void addUser(String userName, String role) {
		User newuser= this.RegisterUser.createnewUser(userName, role);
		if (newuser!=null) {
			users.add(newuser);
		}
	}
	
	public void addAppliance(String Type) {
		Appliance newappliance= this.RegisterAppliance.createnewAppliance(Type);
		if (newappliance!=null) {
			appliances.add(newappliance);
		}
	}
	@Override
	public void show_UserArrayList() {
		for(User u: users) {
			System.out.println(u.getid()+":"+u.getname());
		}
		
	}
	@Override
	public void show_ApplianceArrayList() {
		// TODO Auto-generated method stub
		
	}
	public void removeAppliance(String Aid) {
		int size=appliances.size()-1;
		int index=-1;
		for(int i=0;i<=size;i++) {
			Appliance a= appliances.get(i);
			String id= a.getid();
			if(id.equals(Aid)) {
				index=i;
			}
		}
		if(index!=-1) {
			this.appliances.remove(index);
		}
	}
	public void removeUser(String Aid) {
		int size=users.size()-1;
		int index=-1;
		for(int i=0;i<=size;i++) {
			User u= users.get(i);
			String id= u.getid();
			if(id.equals(Aid)) {
				index=i;
			}
		}
		if(index!=-1) {
			this.users.remove(index);
		}
	}
}

