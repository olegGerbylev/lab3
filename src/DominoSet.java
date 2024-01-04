import java.util.Random;

public class DominoSet {
    private Domino[] dominoes = new Domino[28];

    DominoSet(){
        for (int i = 0; i < dominoes.length;i++){
            dominoes[i] = new Domino(i);
        }
        print();
    }

    public Domino getDomino(int index){
        return dominoes[index];
    }
    public Domino addDomino(Domino currentEndDomino, Domino addedDomino){
        addedDomino.setNextValue(currentEndDomino.getNextValue());
        currentEndDomino.setNextValue(addedDomino.getCurrentValue());
        return addedDomino;
    }

    public Domino nextDomino(Domino currentDomino){
        return dominoes[currentDomino.getNextValue()];
    }

    public Domino deleteDomino(Domino deletedDomino, Domino previousDomino){
        previousDomino.setNextValue(deletedDomino.getNextValue());
        return deletedDomino;
    }

    public void print(){
        String str = "";
        for(Domino domino: dominoes){
            str = str + " " + domino;
        }
        System.out.println(str);
    }

}
