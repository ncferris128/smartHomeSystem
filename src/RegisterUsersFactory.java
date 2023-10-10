
public class RegisterUsersFactory {
	public User createnewUser(String uname, String role) {
		if(role.equals("M")) {
			return new Manager(uname);
		}
		else if(role.equals("W")) {
			return new Worker(uname);
		}
		else if(role.equals("V")) {
			return new Visitor(uname);
		}
		return null;
	}
}
