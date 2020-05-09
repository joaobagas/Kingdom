package locations.deposit;

import locations.mine.Valuable;

import java.util.ArrayList;

public class DepositArray {
    private ArrayList<Valuable> valuables;

    public DepositArray() { valuables = new ArrayList<Valuable>(); }

    public void addValuable(Valuable valuable) { valuables.add(valuable); }

    public Valuable[] getValuables() {
        Valuable[] valuables = new Valuable[this.valuables.size()];
        for(int i = 0; i < this.valuables.size(); i++) {
            valuables[i] = this.valuables.get(i);
        }
        this.valuables = new ArrayList<Valuable>();
        return valuables;
    }

    public boolean isNotEmpty() {
        if (valuables.size() > 0) { return true; }
        return false;
    }
}
