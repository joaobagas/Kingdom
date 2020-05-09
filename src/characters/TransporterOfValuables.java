package characters;

import Log.Log;
import locations.deposit.DepositADT;
import locations.treasure.Guard;

public class TransporterOfValuables implements Runnable {
    private Guard treasure;
    private DepositADT deposit;

    public TransporterOfValuables(Guard treasure, DepositADT deposit) {
        this.treasure = treasure;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        while (true) {
            work();
            try { Thread.sleep(15000); } catch (InterruptedException e) {}
        }
    }

    public void work() {
        if (deposit.isNotEmpty()) {
            Log.get().print("Transporter of valuables >> Transporting the valuables to the treasure room!");
            treasure.add(deposit.getValuables());
        }
        else {
            Log.get().print("Transporter of valuables >> Deposit is empty!");
        }
    }
}
