import java.lang.reflect.Array;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        int N = 5;

        DominoSet dominoSet = new DominoSet();
        dominoSet.printFirstDominoSet();
        DominoSequence dominoSequence = new DominoSequence(dominoSet);
        System.out.println(dominoSequence.print());
        dominoSequence.removeEveryNthDomino(N);

//        DominoSequence sequence = new DominoSequence(dominoSet);
//        System.out.println(sequence.print());
//
//        sequence.removeEveryNthDomino(N);

    }
}
