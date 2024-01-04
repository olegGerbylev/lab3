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

//    public void addDomino(){
//        Domino randomDomino = this.getDomino();
//        if (this.start == null){
//            randomDomino.setNextValue(randomDomino.getCurrentValue());
//            this.start = randomDomino.getCurrentValue();
//            this.end = randomDomino.getCurrentValue();
//            return;
//        }
//        dominoes[end].setNextValue(randomDomino.getCurrentValue());
//        randomDomino.setNextValue(start);
//        end = randomDomino.getCurrentValue();
//    }

//    public Integer deleteDomino(Integer N, Integer currentDominoPosition){
//        if(currentDominoPosition == -1){
//            currentDominoPosition = start;
//        }
//        int step = 0;
//        int nextPosition, lastPosition = currentDominoPosition;
//        while (step < N){
//            if (++step == N){
//                nextPosition = dominoes[currentDominoPosition].getNextValue();
//                dominoes[lastPosition].setNextValue(nextPosition);
//                if(start == end){
//                    System.out.println(dominoes[currentDominoPosition]);
//                    return nextPosition;
//                }
//                if (currentDominoPosition == start){
//                    start = nextPosition;
//                }
//                if(currentDominoPosition == end){
//                    end = lastPosition;
//                }
//                System.out.println(dominoes[currentDominoPosition]);
//                printShuffledArray();
//                return nextPosition;
//            }
//            nextPosition = dominoes[currentDominoPosition].getNextValue();
//            lastPosition = currentDominoPosition;
//            currentDominoPosition = nextPosition;
//        }
//        return -9;
//    }

    public void print(){
        String str = "";
        for(Domino domino: dominoes){
            str = str + " " + domino;
        }
        System.out.println(str);
    }

}
