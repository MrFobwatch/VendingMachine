public class Coin {
    private int value;
    private String name;

    public Coin(int value) {
        this.value = value;
        setName();
    }

    private void setName() {
        switch (value) {
            case 5:
                name = "Nickel";
                break;
            case 10:
                name = "Dime";
                break;
            case 50:
                name = "HalfDollar";
                break;
            case 100:
                name = "DollarCoin";
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
