
public class AutoSleep {

	private int second;
	private int settime;
	private boolean SleepState;
	public AutoSleep(int time) {
		this.second=time;
		this.settime=time;
	}
	public void countDown() {
		while(second!=0) {
			second--;
		}
		if(second==0) {
			reset();
			forcesleep();
		}
	}
	public void reset() {
		second=settime;
	}
	public void forcesleep() {
		SleepState=true;
	}
}
