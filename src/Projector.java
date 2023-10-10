
public class Projector extends Appliance{
	
	static int cur_order_PROJECT=0;
	private AutoSleep autosleep;
	public Projector(){
		super("PJ"+cur_order_PROJECT);	
		cur_order_PROJECT++;
	}
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		
	}

}
