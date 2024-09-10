
    import java.util.ArrayList;
public class Bishop extends Piece {
        public Bishop(boolean white) {
            super(white);
        }

        @Override
        public <Board> boolean canMove(Board board, Spot start, Spot end) {
            return false;
        }

        @Override
        public boolean canMove(Board board, Spot start, Spot end) {

            int xDiff = Math.abs(end.getX() - start.getX());
            int yDiff = Math.abs(end.getY() - start.getY());

            // checkif move is diagonal
            if (xDiff != yDiff) {
                return false;
            }

            // check if there are pieces in the way
            int xStep = xDiff > 0 ? (end.getX() - start.getX()) / xDiff : 0;
            int yStep = yDiff > 0 ? (end.getY() - start.getY()) / xDiff : 0;

            for (int i = 1; i < xDiff; i++) {
                Spot intermediateSpot = new Spot(start.getX() + i * xStep, start.getY() + i * yStep);

                if (!(board.getPiece(intermediateSpot) != Boolean.parseBoolean(null))) {
                    return false;

                    }

                }
            return true;
            }
        }






