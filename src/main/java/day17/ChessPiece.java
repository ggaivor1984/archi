package day17;

public enum ChessPiece {
    PAWN_WHITE(1, "\u2659"), PAWN_BLACK(1, "\u265F"), KNIGHT_WHITE(3, "\u2658"),
    KNIGHT_BLACK(3, "\u265E"), BISHOP_WHITE(3.5, "\u2657"), BISHOP_BLACK(3.5, "\u265D"),
    ROOK_WHITE(5, "\u2656"), ROOK_BLACK(5, "\u265C"), QUEEN_WHITE(9, "\u2655"),
    QUEEN_BLACK(9, "\u265B"), KING_WHITE(100, "\u2654"), KING_BLACK(100, "\u265A"), EMPTY(-1, "_");

    private double value;
    private String look;

    ChessPiece(double value, String look) {
        this.value = value;
        this.look = look;
    }

    public double getValue() {
        return value;
    }

    public String getLook() {
        return look;
    }
}
