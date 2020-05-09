package locations.mine;

public class Mine {
    public Mine() {}

    public Valuable getRandomValuable() {
        int a = (int) (Math.random() * 5);
        switch (a) {
            case 0:
                return new Diamond();
            case 1:
                return new Ruby();
            case 2:
                return new Sapphire();
            case 3:
                return new Silver();
            case 4:
                return new Bronze();
        }
        return null;
    }
}
