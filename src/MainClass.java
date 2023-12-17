import java.lang.reflect.Array;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        int N = 5;

        DominoSet dominoSet = new DominoSet();
        System.out.println("Initial set: " + dominoSet);

        DominoSequence sequence = new DominoSequence(dominoSet);
        System.out.println(sequence.print());

        sequence.removeEveryNthDomino(N);

    }
}
