public class Domino {
    int side1;
    int side2;

    public Domino(int side1) {
        this.side1 = side1;
        this.side2 = -1;
    }

    @Override
    public String toString() {
        return side1 / 4 + "|" + (side1 % 4 + side1 / 4) % 7;
    }
}
