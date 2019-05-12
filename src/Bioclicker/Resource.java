package Bioclicker;

import java.awt.Color;

public class Resource {
    public String name;
    public String displayName;
    public double value;
    public double perTick;
    public boolean unlocked;
    public Color displayColor;

    public Resource(String nm, String dispName, double val, double initPerTick, boolean unlock, Color col) {
        name = nm;
        displayName = dispName;
        value = val;
        perTick = initPerTick;
        unlocked = unlock;
        displayColor = col;
    }

    public Resource(String nm, String dispName, double val, double initPerTick, boolean unlocked) {
        this(nm, dispName, val, initPerTick, unlocked, new Color(192, 192, 192));
    }

    public Resource(String nm, String dispName, double val, double initPerTick) {
        this(nm, dispName, val, initPerTick, false);
    }

    public Resource(String nm, String dispName, double val) {
        this(nm, dispName, val, 0);
    }

    public Resource(String nm, String dispName)
    {
        this(nm, dispName, 0);
    }
}
