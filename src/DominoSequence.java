public class DominoSequence {
    private int length = 28;
    private Domino[] sequence;
    private DominoSet set;

    public DominoSequence(DominoSet set) {
        int i;
        sequence = set.getDominoes();
        for(i = 0; i < 28; i++ ){
            Domino currentDomini = set.getDomino();
            if(i == 0){
                currentDomini.setNextValue(currentDomini.getCurrentValue());
                this.sequence[0] = currentDomini;
            }else {
                sequence[i-1].setNextValue(currentDomini.getCurrentValue());
                currentDomini.setNextValue(sequence[0].getCurrentValue());
                this.sequence[i] = currentDomini;
            }
        }
        this.set = set;
    }

    public void removeEveryNthDomino(int N) {
        int remaining = sequence.length;
        int stepCount = 0;
        Domino lastDomino = sequence[27];
        while (remaining != 0) {
            Domino currentDomino = set.NextDomino(lastDomino.getCurrentValue());
            if (++stepCount == N){
                System.out.println("del: "+ currentDomino);
                lastDomino.setNextValue(currentDomino.getNextValue());
                currentDomino.setCurrentValue(-1);
                remaining--;
                stepCount=0;
                System.out.println(print());
            }else {
                lastDomino = currentDomino;
            }

        }
    }

    public String print() {
        String str = "";
        for (Domino domino: sequence){
            if (domino.getCurrentValue() != -1) {
                str += " " + domino;
            }
        }
        return str;
    }
}
