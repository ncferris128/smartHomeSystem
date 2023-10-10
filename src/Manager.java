
public class Manager extends User {
	
	public static int cur_order_m=0;
	public Manager(String uname) {
		super(uname,"M"+cur_order_m);
		
	}

}
