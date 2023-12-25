import java.lang.reflect.Array;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        int N = 5;

        DominoSet dominoSet = new DominoSet();
        DominoSeq dominoSeq = new DominoSeq(dominoSet);
        dominoSet.printShuffledArray();
        dominoSeq.deleteDomino(N, dominoSet);

    }
}
