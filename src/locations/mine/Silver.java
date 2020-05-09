package locations.mine;

public class Silver implements Valuable {
    @Override
    public String getName() { return "Silver"; }

    @Override
    public int getValue() { return 25; }
}