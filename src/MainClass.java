import java.lang.reflect.Array;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        int N = 5;

        DominoSet dominoSet = new DominoSet();
        DominoSeq dominoSeq = new DominoSeq(dominoSet);
        for (int i =0; i < 28; i++){
            dominoSeq.addDomino();
        }
        dominoSeq.printShuffledArray();
        int currentDomino = dominoSeq.getEnd().getCurrentValue();
        for (int j =0; j < 28; j++){
            currentDomino = dominoSeq.deleteDomino(N, currentDomino);
        }
//        dominoSeq.deleteDomino(N, dominoSet);

    }
}
