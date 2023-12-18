public class Domino {
    private int side1;
    public Domino(int side1) {
        this.side1 = side1;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    @Override
    public String toString() {
        return side1 / 4 + "|" + (side1 % 4 + side1 / 4) % 7;
    }
}
