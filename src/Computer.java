
public class Computer extends Appliance{

	static int cur_order_PC=0;
	private AutoSleep autosleep;
	public Computer(){
		super("PT"+cur_order_PC);	
		cur_order_PC++;
	}
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		
	}

}
