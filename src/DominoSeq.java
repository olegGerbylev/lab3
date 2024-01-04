import java.util.Random;

public class DominoSeq {


    private DominoSet set;
    private Domino end;
    private Random random = new Random();

    DominoSeq(DominoSet set){
        this.set = set;
    }

    public Domino getEnd() {
        return end;
    }

    public void addDomino(){
        Domino newDomino = getDomino();
        if (end == null){
            end = newDomino;
        }
        end = set.addDomino(end, newDomino);
    }

    public Domino getDomino(){
        while (true) {
            int currentIndexDomino = random.nextInt(28);
            if (set.getDomino(currentIndexDomino).getNextValue() < 0){
                return set.getDomino(currentIndexDomino);
            }
        }
    }

    public void printShuffledArray(){
        String str = "";

        Domino currentDomino = set.getDomino(end.getNextValue());
        while (currentDomino != end){
            str = str + " " + currentDomino;
            currentDomino = set.nextDomino(currentDomino);
        }
        str = str + " " + currentDomino;
        System.out.println(str);
    }


    public int deleteDomino(int N, int currentDominoIndex){
        Domino previousDomino = null;
        Domino currentDomino = set.getDomino(currentDominoIndex);
        for(int j = 0; j < N; j++){
            previousDomino = currentDomino;
            currentDomino = set.nextDomino(currentDomino);
        }
        Domino deletedDomino = set.deleteDomino(currentDomino,previousDomino);
        System.out.println(deletedDomino);
        if (deletedDomino == end && deletedDomino == set.nextDomino(end)){
            return previousDomino.getCurrentValue();
        }
        if (deletedDomino == end){
            previousDomino.setNextValue(end.getNextValue());
            end = previousDomino;
        } else if (deletedDomino == set.nextDomino(end)){
            end.setNextValue(set.nextDomino(end).getNextValue());
        }
        printShuffledArray();
        return previousDomino.getCurrentValue();
    }
}
