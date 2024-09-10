public  class Rook extends Piece{
        private boolean castlingDone = false;

        public Rook(boolean white)
        {
            super(white);
        }

    @Override
    public <Board> boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }

    public boolean isCastlingDone()
        {
            return this.castlingDone;
        }
        @Override
        public boolean  canMove(Board board,Spot start, Spot end)
        {
            if (end.getPiece().isWhite()==this.isWhite()) {
                return false;
            }
            int x = Math.abs(start.getX() - end.getX());
            int y = Math.abs(start.getY() - end.getY());
            if (x + y == 1){
                return true;
            }
            return this.isValidCastling(board, start, end);
        }
        private <Board> boolean isValidCastling(Board board, Spot start, Spot end)
        {
            if(this.isCastlingDone()){
                return false;
            }
            return false;
        }
        public boolean isCastlingMove(Spot start, Spot end)
        {
            int x = Math.abs(start.getX() - end.getX());
            int y = Math.abs(start.getY() - end.getY());
            if (x + y == 1) {
                return true;
            }
            return true;
        }


    }


