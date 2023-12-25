import java.util.Random;

public class DominoSet {
    private Domino[] dominoes = new Domino[28];
    private Random random = new Random();
    private Integer end;
    private Integer start;

    DominoSet(){
        for (int i = 0; i < dominoes.length;i++){
            dominoes[i] = new Domino(i);
        }
        print();
    }
    public void addDomino(){
        Domino randomDomino = this.getDomino();
        if (this.start == null){
            randomDomino.setNextValue(randomDomino.getCurrentValue());
            this.start = randomDomino.getCurrentValue();
            this.end = randomDomino.getCurrentValue();
            return;
        }
        dominoes[end].setNextValue(randomDomino.getCurrentValue());
        randomDomino.setNextValue(start);
        end = randomDomino.getCurrentValue();
    }

    public Integer deleteDomino(Integer N, Integer currentDominoPosition){
        if(currentDominoPosition == -1){
            currentDominoPosition = start;
        }
        int step = 0;
        int nextPosition, lastPosition = currentDominoPosition;
        while (step < N){
            if (++step == N){
                nextPosition = dominoes[currentDominoPosition].getNextValue();
                dominoes[lastPosition].setNextValue(nextPosition);
                if(start == end){
                    System.out.println(dominoes[currentDominoPosition]);
                    return nextPosition;
                }
                if (currentDominoPosition == start){
                    start = nextPosition;
                }
                if(currentDominoPosition == end){
                    end = lastPosition;
                }
                System.out.println(dominoes[currentDominoPosition]);
                printShuffledArray();
                return nextPosition;
            }
            nextPosition = dominoes[currentDominoPosition].getNextValue();
            lastPosition = currentDominoPosition;
            currentDominoPosition = nextPosition;
        }
        return -9;
    }

    public Domino getDomino(){
        while (true) {
            int currentIndexDomino = random.nextInt(28);
            if (dominoes[currentIndexDomino].getNextValue() < 0){
                return dominoes[currentIndexDomino];
            }
        }
    }

    public void print(){
        String str = "";
        for(Domino domino: dominoes){
            str = str + " " + domino;
        }
        System.out.println(str);
    }
    public void printShuffledArray(){
        String str = "";
        Domino currentDomino = dominoes[start];
        while (currentDomino != dominoes[end]){
            str = str + " " + currentDomino;
            currentDomino = dominoes[currentDomino.getNextValue()];
        }
        str = str + " " + currentDomino;
        System.out.println(str);
    }
}
