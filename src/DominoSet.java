import javax.annotation.processing.SupportedSourceVersion;
import java.util.Random;

public class DominoSet {
    private Domino[] dominoes = new Domino[28];
    private Random random = new Random();

    public Domino[] getDominoes() {
        return dominoes;
    }

    public Domino NextDomino(int i){
        int j = 0;
        int nextValue = -2;
        while (true){
            if (dominoes[j].getCurrentValue() == i) nextValue = dominoes[j].getNextValue();
            if(dominoes[j].getCurrentValue() == nextValue) return dominoes[j];
            j = (j + 1) % dominoes.length;
        }
    }

    public void printFirstDominoSet(){
        String str = "";
        for (int i = 0; i < 28; i++) {
            str = str + " " + new Domino(i);
        }
        System.out.println(str);
    }
    @Override
    public String toString(){
        String str = "";
        for (Domino domino : dominoes){
            str = str + " " + domino.toString();
        }
        return str;
    }

    public Domino getDomino(){
        while (true) {
            int currentIndexDomino = random.nextInt(28);
            for (int i =0; i < dominoes.length; i++) {
                if (dominoes[i] != null && dominoes[i].getCurrentValue() == currentIndexDomino) break;
                if(i == 27){
                    return new Domino(currentIndexDomino);
                }
            }
        }
    }
}
