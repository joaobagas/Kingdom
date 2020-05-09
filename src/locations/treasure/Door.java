package locations.treasure;

import locations.mine.Valuable;

public interface Door {
    void add(Valuable[] valuable);
    Valuable[] retrieve();
    int getCombinedValue();
    String lookAtValuables();
}
