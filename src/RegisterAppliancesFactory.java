
public class RegisterAppliancesFactory {
	public Appliance createnewAppliance(String Type) {
		if(Type.equals("AC")) {
			return new AirCon();
		}
		else if(Type.equals("L")) {
			return new Light();
		}
		else if(Type.equals("PT")) {
			return new Printer();
		}
		else if(Type.equals("PJ")) {
			return new Projector();
		}
		else if(Type.equals("PC")) {
			return new Computer();
		}
		return null;
	}
}
