
public abstract class User {
	Controller Basiccontroller=Controller.getInstance();
	private String userName;
	private String userID;
	public User(String uname, String id) {
		setName(uname);
		setID(id);
	}
	public void setName(String uname) {
		this.userName=uname;
	}
	public void setID(String ID) {
		this.userID=ID;
	}
	public String getid() {
		
		return userID;
	}
	public String getname() {

		return this.userName;
	}
}
