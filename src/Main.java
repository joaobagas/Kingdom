import characters.Accountant;
import characters.King;
import characters.Miner;
import characters.TransporterOfValuables;
import locations.deposit.DepositADT;
import locations.mine.Mine;
import locations.treasure.Guard;


public class Main {
    public static void main(String[] args) {
        DepositADT deposit = new DepositADT();
        Mine mine = new Mine();
        Guard treasure = new Guard();

        King king = new King(treasure);
        Accountant accountant = new Accountant(treasure);
        TransporterOfValuables transporterOfValuables = new TransporterOfValuables(treasure, deposit);
        Miner miner = new Miner(mine, deposit);

        Thread t1 = new Thread(king);
        Thread t2 = new Thread(accountant);
        Thread t3 = new Thread(transporterOfValuables);
        Thread t4 = new Thread(miner);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
