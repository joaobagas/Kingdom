package locations.deposit;

import locations.mine.Valuable;

public class DepositADT {
    private DepositArray deposit;

    public DepositADT() { deposit = new DepositArray(); }

    public void addValue(Valuable valuable) { deposit.addValuable(valuable);}

    public Valuable[] getValuables() { return deposit.getValuables(); }

    public boolean isNotEmpty() { return deposit.isNotEmpty(); }
}
