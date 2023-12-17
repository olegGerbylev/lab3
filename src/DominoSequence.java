public class DominoSequence {
    Domino[] sequence = new Domino[28];
    int length = 28;

    public DominoSequence(DominoSet set) {
        int i = 0;
        while (i <= 27){
            Domino currentDomini = set.getDomino();
            if(i == 0){
                currentDomini.side2 = currentDomini.side1;
                this.sequence[0] = currentDomini;
            }else {
                sequence[i-1].side2 = currentDomini.side1;
                currentDomini.side2 = sequence[0].side1;
                this.sequence[i] = currentDomini;
            }
            i++;
        }
    }

    public void removeEveryNthDomino(int N) {
        int current = 0;
        int remaining = length;
        int stepCount = 0; // Счетчик шагов

        while (remaining > 0) {
            if (sequence[current].side1 != -1) {
                if (++stepCount == N) {
                    System.out.println("Removing: " + sequence[current]);
                    sequence[current].side1 = -1;
                    stepCount = 0; // Сброс счетчика шагов
                    remaining--;
                    System.out.println(this.print());
                }
            }
            current = (current + 1) % length;
        }
    }

    public String print() {
        String str = "";
        for (Domino domino: sequence){
            if (domino.side1 != -1) {
                str += " " + domino;
            }
        }
        return str;
    }
}
