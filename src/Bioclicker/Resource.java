package Bioclicker;

public class Resource {
	public String Name;
	public String DisplayName;
	public double Value;
	public double PerTick;
	
	public Resource(String nm, String dispName, double val, double perTick) {
		Name = nm;
		DisplayName = dispName;
		Value = val;
		PerTick = perTick;
	}
	
	public Resource(String nm, String dispName, double val) {
		Name = nm;
		DisplayName = dispName;
		Value = val;
		PerTick = 0;
	}
	
	public Resource(String nm, String dispName) {
		Name = nm;
		DisplayName = dispName;
		Value = 0;
		PerTick = 0;
	}
}
