package characters;

import locations.treasure.Guard;
import log.Log;

public class King implements Runnable {
    private Guard treasure;

    public King(Guard treasure) {
        this.treasure = treasure;
    }

    @Override
    public void run() {
        while (true) {
            work();
            try { Thread.sleep(5000); } catch (InterruptedException e) {}
        }
    }

    public void work() {
        int a = (int) (Math.random() * 3);
        switch (a) {
            case 0:
                checkBalance();
                break;
        }
    }

    public void checkBalance() {
        if ((treasure.getCombinedValue() > (Math.random() * 100) + 100)) {
            Log.get().print("King                     >> Let's throw the party!");
            treasure.retrieve();
        }
        else {
            Log.get().print("King                     >> I can't throw the party!");
        }
    }
}
