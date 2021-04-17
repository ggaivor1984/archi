package day17;

public class ChessBoard {
    private String[][] dislocation;

    public ChessBoard(String[][] dislocation) {
        this.dislocation = dislocation;
    }

    public void print() {
        for (int i = 0; i < dislocation.length; i++) {
            for (int j = 0; j < dislocation[i].length; j++) {
                System.out.print(dislocation[i][j]);
            }
            System.out.println();
        }
    }
}
