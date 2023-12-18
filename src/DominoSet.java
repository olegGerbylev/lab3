import javax.annotation.processing.SupportedSourceVersion;
import java.util.Random;

public class DominoSet {
    private Domino[] dominoes = new Domino[28];
    private Random random = new Random();

    public void setDominoes(int i, Domino dominoes) {
        this.dominoes[i] = dominoes;
    }

    public Domino[] getDominoes() {
        return dominoes;
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
                if (dominoes[i] != null && dominoes[i].getSide1() == currentIndexDomino) break;
                if(i == 27){
                    return new Domino(currentIndexDomino);
                }
            }
        }
    }

}
