package Bioclicker;

import java.awt.Color;

public class Resource {
    public String Name;
    public String DisplayName;
    public double Value;
    public double PerTick;
    public boolean Unlocked;
    public Color DisplayColor;
	
    public Resource(String nm, String dispName, double val, double perTick, boolean unlocked, Color col) {
        Name = nm;
        DisplayName = dispName;
        Value = val;
        PerTick = perTick;
        Unlocked = unlocked;
        DisplayColor = col;
    }
	
    public Resource(String nm, String dispName, double val, double perTick, boolean unlocked) {
        this(nm, dispName, val, perTick, unlocked, new Color(192, 192, 192));
    }
	
    public Resource(String nm, String dispName, double val, double perTick) {
        this(nm, dispName, val, perTick, false);
    }
	
    public Resource(String nm, String dispName, double val) {
        this(nm, dispName, val, 0);
    }
	
    public Resource(String nm, String dispName) {
        this(nm, dispName, 0);
    }
}
