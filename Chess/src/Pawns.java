public class Pawns extends Piece {


    public Pawns(boolean white) {
        super(white);
    }

    @Override
    public <Board> boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {

        if (end.getPiece().isWhite() == this.isWhite()) {
                return false;
            }
            int x = Math.abs(start.getX() - end.getX());
            int y = Math.abs(start.getY() - end.getY());
            return (x==1&&y==1) || (x ==0 && y == 1);


        }


    }