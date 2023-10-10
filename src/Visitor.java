
public class Visitor extends User {

	public static int cur_order_v=0;
	public Visitor(String uname) {
		super(uname,"V"+cur_order_v);
		cur_order_v++;
	}

}
