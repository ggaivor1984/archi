package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] chessPieces = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i >= 4) {
                chessPieces[i] = ChessPiece.ROOK_WHITE.getLook();
            } else chessPieces[i] = ChessPiece.PAWN_WHITE.getLook();
        }
        for (String s : chessPieces) {
            System.out.print(s + " ");
        }


    }
}