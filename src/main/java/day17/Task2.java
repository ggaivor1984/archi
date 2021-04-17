package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] kasparovVersusKramnik = new String[8][8];
        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 5 || i == 6) continue;
            kasparovVersusKramnik[0][i] = ChessPiece.EMPTY.getLook();
        }
        kasparovVersusKramnik[0][0] = ChessPiece.ROOK_BLACK.getLook();
        kasparovVersusKramnik[0][5] = ChessPiece.ROOK_BLACK.getLook();
        kasparovVersusKramnik[0][6] = ChessPiece.KING_BLACK.getLook();

        for (int i = 0; i < 8; i++) {
            if (i == 1 || i == 4 || i == 5 || i == 7) continue;
            kasparovVersusKramnik[1][i] = ChessPiece.EMPTY.getLook();
        }
        kasparovVersusKramnik[1][1] = ChessPiece.ROOK_WHITE.getLook();
        kasparovVersusKramnik[1][4] = ChessPiece.PAWN_BLACK.getLook();
        kasparovVersusKramnik[1][5] = ChessPiece.PAWN_BLACK.getLook();
        kasparovVersusKramnik[1][7] = ChessPiece.PAWN_BLACK.getLook();

        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 2 || i == 6) continue;
            kasparovVersusKramnik[2][i] = ChessPiece.EMPTY.getLook();
        }
        kasparovVersusKramnik[2][0] = ChessPiece.PAWN_BLACK.getLook();
        kasparovVersusKramnik[2][2] = ChessPiece.KNIGHT_BLACK.getLook();
        kasparovVersusKramnik[2][6] = ChessPiece.PAWN_BLACK.getLook();

        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 3) continue;
            kasparovVersusKramnik[3][i] = ChessPiece.EMPTY.getLook();
        }
        kasparovVersusKramnik[3][0] = ChessPiece.QUEEN_BLACK.getLook();
        kasparovVersusKramnik[3][3] = ChessPiece.BISHOP_WHITE.getLook();

        for (int i = 0; i < 8; i++) {
            if (i == 3 || i == 4) continue;
            kasparovVersusKramnik[4][i] = ChessPiece.EMPTY.getLook();
        }
        kasparovVersusKramnik[4][3] = ChessPiece.BISHOP_BLACK.getLook();
        kasparovVersusKramnik[4][4] = ChessPiece.PAWN_WHITE.getLook();

        for (int i = 0; i < 8; i++) {
            if (i == 4 || i == 5) continue;
            kasparovVersusKramnik[5][i] = ChessPiece.EMPTY.getLook();
        }
        kasparovVersusKramnik[5][4] = ChessPiece.BISHOP_WHITE.getLook();
        kasparovVersusKramnik[5][5] = ChessPiece.PAWN_WHITE.getLook();

        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 3 || i == 5 || i == 7) continue;
            kasparovVersusKramnik[6][i] = ChessPiece.EMPTY.getLook();
        }
        kasparovVersusKramnik[6][0] = ChessPiece.PAWN_WHITE.getLook();
        kasparovVersusKramnik[6][3] = ChessPiece.QUEEN_WHITE.getLook();
        kasparovVersusKramnik[6][5] = ChessPiece.PAWN_WHITE.getLook();
        kasparovVersusKramnik[6][7] = ChessPiece.PAWN_WHITE.getLook();

        for (int i = 0; i < 8; i++) {
            if (i == 5 || i == 6) continue;
            kasparovVersusKramnik[7][i] = ChessPiece.EMPTY.getLook();
        }
        kasparovVersusKramnik[7][5] = ChessPiece.ROOK_WHITE.getLook();
        kasparovVersusKramnik[7][6] = ChessPiece.KING_WHITE.getLook();

        ChessBoard board = new ChessBoard(kasparovVersusKramnik);
        board.print();
    }
}
