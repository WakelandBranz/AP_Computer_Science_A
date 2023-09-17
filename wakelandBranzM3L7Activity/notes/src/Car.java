public class Car {
    private String make;
    private String owner;
    private boolean isSports;

    public Car (String mk, String own, boolean sports) {
        make = mk;
        owner = own;
        isSports = sports;
    }
    public Car () {
        make = null;
        owner = null;
        isSports = false;
    }
}
