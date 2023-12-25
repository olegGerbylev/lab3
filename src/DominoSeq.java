public class DominoSeq {
    DominoSeq(DominoSet set){
        for(int i = 0; i < 28; i++){
            set.addDomino();
        }
    }
    public void deleteDomino(int N, DominoSet set){
        Integer currentIndex = -1;
            for(int j = 0; j < 28; j++){
            currentIndex = set.deleteDomino(N, currentIndex);
        }
    }
}
