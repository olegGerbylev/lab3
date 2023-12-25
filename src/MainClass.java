import java.lang.reflect.Array;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        int N = 5;

        DominoSet dominoSet = new DominoSet();
        for(int i = 0; i < 28; i++){
            dominoSet.addDomino();
        }
        dominoSet.printShuffledArray();
        Integer currentIndex = -1;
        for(int j = 0; j < 28; j++){
            currentIndex = dominoSet.deleteDomino(N, currentIndex);
        }

    }
}
