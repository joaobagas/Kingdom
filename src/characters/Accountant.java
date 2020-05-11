package characters;

import log.Log;
import locations.treasure.Guard;

public class Accountant implements Runnable {
    private String valuablesString;
    private Guard treasure;

    public Accountant(Guard treasure) {
        this.treasure = treasure;
        valuablesString = treasure.lookAtValuables();
    }

    @Override
    public void run() {
        while (true) {
            work();
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
        }
    }

    public void work() {
        if (!(treasure.lookAtValuables().equals(valuablesString))) {
            valuablesString = treasure.lookAtValuables();
            Log.get().print("Accountant               >> Valuables updated to " + treasure.getCombinedValue() + "kr!");
        }
    }
}
