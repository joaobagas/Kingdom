package locations.treasure;

import locations.mine.Valuable;

import java.util.ArrayList;

public class Room {
    private ArrayList<Valuable> valuables;

    public Room() { valuables = new ArrayList<Valuable>(); }

    public void add(Valuable[] valuables) {
        for (int i = 0; i < valuables.length; i++) {
            this.valuables.add(valuables[i]);
        }
    }

    public Valuable[] retrieve() {
        Valuable[] v = new Valuable[valuables.size()];
        for (int i = 0; i < valuables.size(); i++) {
            v[i] = valuables.get(i);
        }
        valuables.clear();
        return v;
    }

    public int getCombinedValue() {
        int value = 0;
        for (int i = 0; i < valuables.size(); i++) {
            value += valuables.get(i).getValue();
        }
        return value;
    }

    public String lookAtValuables() {
        String s = "";
        for (int i = 0; i < valuables.size(); i++) {
            s += " Name: " + valuables.get(i).getName() + " Value: " + valuables.get(i).getValue() + "\n";
        }
        return s;
    }
}
