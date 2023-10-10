
public class Light extends Appliance{

	static int cur_order_L=0;
	private AutoRegulate auotmode;
	public Light(){
		super("PT"+cur_order_L);	
		cur_order_L++;
	}
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		
	}

}
