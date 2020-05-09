package locations.treasure;

import locations.mine.Valuable;

public class Guard implements Door {
    private Room room;
    private boolean someoneIsInside;

    public Guard() {
        room = new Room();
        someoneIsInside = false;
    }

    // My try at making it thread safe

    @Override
    public void add(Valuable[] valuables) {
        while (someoneIsInside) {}
        someoneIsInside = true;
        room.add(valuables);
        someoneIsInside = false;
    }

    @Override
    public Valuable[] retrieve() {
        while (someoneIsInside) {}
        someoneIsInside = true;
        Valuable[] v = room.retrieve();
        someoneIsInside = false;
        return v;
    }

    @Override
    public int getCombinedValue() { return room.getCombinedValue(); }

    @Override
    public String lookAtValuables() { return room.lookAtValuables(); }
}
