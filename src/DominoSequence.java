public class DominoSequence {
    private int length = 28;
    Domino[] sequence;

    public DominoSequence(DominoSet set) {
        int i;
        for(i = 0; i < 28; i++ ){
            Domino currentDomini = set.getDomino();
            set.setDominoes(i, currentDomini);
        }
        this.sequence = set.getDominoes();
    }

    public void removeEveryNthDomino(int N) {
        int current = 0;
        int remaining = length;
        int stepCount = 0; // Счетчик шагов

        while (remaining != 0) {
            if (sequence[current].getSide1() != -1) {
                if (++stepCount == N) {
                    System.out.println("Removing: " + sequence[current]);
                    sequence[current].setSide1(-1);
                    stepCount = 0;
                    remaining--;
                    System.out.println(this.print());
                }
            }
            current = (current + 1) % length;
        }
    }

    public String print() {
        String str = "";
        for (Domino domino: sequence){
            if (domino.getSide1() != -1) {
                str += " " + domino;
            }
        }
        return str;
    }
}
