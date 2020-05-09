package characters;

import Log.Log;
import locations.deposit.DepositADT;
import locations.mine.Mine;
import locations.mine.Valuable;

public class Miner implements Runnable {
    private Mine mine;
    private DepositADT deposit;

    public Miner(Mine mine, DepositADT deposit) {
        this.mine = mine;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        while (true) {
            work();
            try { Thread.sleep(5000); } catch (InterruptedException e) {}
        }
    }

    public void work() {
        int a = (int) (Math.random() * 4);
        switch (a) {
            case 0:
                Valuable v = mine.getRandomValuable();
                deposit.addValue(v);
                Log.get().print("Miner                    >> " + v.getName() + " found!");
                break;
            case 1:
            case 2:
                Log.get().print("Miner                    >> No valuable found!");
                break;
        }
    }
}
