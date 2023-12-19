public class Domino {
    private int currentValue;
    private int nextValue = -1;
    public Domino(int side1) {
        this.currentValue = side1;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setNextValue(int nextValue) {
        this.nextValue = nextValue;
    }

    public int getNextValue() {
        return nextValue;
    }

    @Override
    public String toString() {
        return currentValue / 4 + "|" + (currentValue % 4 + currentValue / 4) % 7;
    }
}
