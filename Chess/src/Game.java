import java.util.List;

public class Game {
    private Player[] player;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;


    private void initialize(Player p1, Player p2) {

        player[0] = p1;
        player[1] = p2;

        board.resetBoard();

        if (p1.isWhiteSide()) {
            this.currentTurn = p1;
        } else {
            this.currentTurn = p2;
        }
        movesPlayed.clear();
    }

    public boolean isEnd() {
        return this.getStatus() != GameStatus.ACTIVE;
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public boolean playerMove(Player player, int startX, int startY, int endX, int endY)
            throws Exception {
        Spot startBox = board.getBox(startX, startY);
        Spot endBox = board.getBox(startY, endY);
        Move move = new Move(player, startBox, endBox);
        return this.makeMove(move, player);
    }

    private boolean makeMove(Move move, Player player) {
        Piece sourcePiece = move.getStart().getPiece();
        if (sourcePiece == null) {
            return false;
        }
        //valid player
        if (player != currentTurn) {
            return false;
        }
        if (sourcePiece.isWhite() != player.isWhiteSide()) {
            return false;
        }
        //valid move
        if (!sourcePiece.canMove(board, move.getStart(), move.getEnd())) {
            return false;
        }
        //kill
        Piece destPiece = move.getStart().getPiece();
        if (destPiece != null) {
            destPiece.setKilled(true);
            move.setPieceKilled(destPiece);
        }
        //castling
        if (sourcePiece != null && sourcePiece instanceof King && ((King) sourcePiece).isCastlingMove()) {
            move.setCastlingMove(true);
        }
        //store moves
        movesPlayed.add(move);
        //move piece from start box to end box
        move.getEnd().setPiece(move.getStart().getPiece());
        move.getStart.setPiece(null);

        if (destPiece != null && destPiece instanceof King) {
            if (player.isWhiteSide()) {
                this.setStatus(GameStatus.WHITE_WIN);
            } else {
                this.setStatus(GameStatus.BLACK_WIN);
            }
        }
        //Set the current turn to the other player
        Player[] players = new Player[2];
        if (this.currentTurn != players[0]) {
            this.currentTurn = players[0];
        } else {
            this.currentTurn = players[1];
        }
            return true;
    }

    public void printBoard() {

    }

    public Move getCurrentPlayer() {
        return null;
    }

    public void applyMove(Move move) {
    }

    public boolean isGameOver() {
        return isGameOver();
    }

    public void printStatus() {
        ;
    }
}

