import javax.annotation.processing.SupportedSourceVersion;
import java.util.Random;

public class DominoSet {
     Domino[] dominoes = new Domino[28];
    public Random random = new Random();

    public DominoSet() {
        int count = 0;
        for (int i = 0; i < 28; i++) {
                dominoes[count++] = new Domino(i);
        }
    }

    public Domino[] getDominoes() {
        return dominoes;
    }
    //    public void shuffle() {
//        for (int i = 0; i < dominoes.length; i++) {
//            int randomIndex = i + random.nextInt(dominoes.length - i);
//            Domino temp = dominoes[i];
//            dominoes[i] = dominoes[randomIndex];
//            dominoes[randomIndex] = temp;
//        }
//    }

//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (Domino d : dominoes) {
//            sb.append(d.toString()).append(" ");
//        }
//        return sb.toString().trim();
//    }

    @Override
    public String toString(){
        String str = "";
        for (Domino domino : dominoes){
            str = str + " " + domino.toString();
        }
        return str;
    }

    public Domino getDomino(){
        Domino curentDomino;
        do{
            curentDomino = dominoes[random.nextInt(dominoes.length)];
        }while (curentDomino.side2 != -1);
        return curentDomino;
    }
}
