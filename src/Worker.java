
public class Worker extends User {

	public static int cur_order_w=0;
	public Worker(String uname) {
		super(uname,"W"+cur_order_w);
		cur_order_w++;
	}

}
