public class DominoSeq {
    int N;
    DominoSet set;
    DominoSeq(int N, DominoSet set){
       this.N = N;
       this.set = set;
    }
    public void createSeq(){
        for(int i = 0; i < 28; i++){
            set.addDomino();
        }
    }
    public void deleteDomino(){
        Integer currentIndex = -1;
            for(int j = 0; j < 28; j++){
            currentIndex = set.deleteDomino(N, currentIndex);
        }
    }
}
