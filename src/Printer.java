
public class Printer extends Appliance{
	
	
	static int cur_order_PRINT=0;
	private AutoSleep autosleep;
	public Printer(){
		super("PT"+cur_order_PRINT);	
		cur_order_PRINT++;
	}
	@Override
	public void operate() {
		
		
	}
}

