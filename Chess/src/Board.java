public class Board {
    Spot [][] boxes;
    public Board()
    {
        this.resetBoard();
    }
    public Spot getBox(int x, int y) throws Exception {
        if (x < 0 || y < 0 || y > 7){
            throw new Exception("Index out of bound");
        }
        return boxes [x][y];
    }
    public void resetBoard()
    {   //initialise the white pieces
        boxes[0][0] = new Spot(0, 0, new Rook(true));
        boxes[0][1] = new Spot(0, 1, new Knight(true));
        boxes[0][2] = new Spot(0, 2, new Bishop(true));
        boxes[0][3] = new Spot(0, 3, new Queen(true));
        boxes[0][4] = new Spot(0, 4, new King(true));
        boxes[0][5] = new Spot(0, 5, new Bishop(true));
        boxes[0][6] = new Spot(0, 6, new Knight(true));
        boxes[0][7] = new Spot(0, 7, new Rook(true));
        boxes[1][0] = new Spot(0, 0, new Pawns(true));
        boxes[1][1] = new Spot(0, 1, new Pawns(true));
        boxes[1][2] = new Spot(0, 2, new Pawns(true));
        boxes[1][3] = new Spot(0, 3, new Pawns(true));
        boxes[1][4] = new Spot(0, 4, new Pawns(true));
        boxes[1][5] = new Spot(0, 5, new Pawns(true));
        boxes[1][6] = new Spot(0, 6, new Pawns(true));
        boxes[1][7] = new Spot(0, 7, new Pawns(true));
        //initialize the black pieces
        boxes[7][0] = new Spot(7, 0, new Rook(false));
        boxes[7][1] = new Spot(7, 1, new Knight(false));
        boxes[7][2] = new Spot(7, 2, new Bishop(false));
        boxes[7][3] = new Spot(7, 3, new Queen(false));
        boxes[7][4] = new Spot(7, 4, new King(false));
        boxes[7][5] = new Spot(7, 5, new Bishop(false));
        boxes[7][6] = new Spot(7, 6, new Knight(false));
        boxes[7][7] = new Spot(7, 7, new Rook(false));
        boxes[6][0] = new Spot(6, 0, new Pawns(false));
        boxes[6][1] = new Spot(6, 1, new Pawns(false));
        boxes[6][2] = new Spot(6, 2, new Pawns(false));
        boxes[6][3] = new Spot(6, 3, new Pawns(false));
        boxes[6][4] = new Spot(6, 4, new Pawns(false));
        boxes[6][5] = new Spot(6, 5, new Pawns(false));
        boxes[6][6] = new Spot(6, 6, new Pawns(false));
        boxes[6][7] = new Spot(6, 7, new Pawns(false));

        //initialize the remaining boxes
        for (int i=2; i < 6;i++){
            for (int j = 0; j< 8; j++){
                boxes[i][j] = new Spot(i, j, null);
            }
        }


    }

    public boolean getPiece() {
        return getPiece(null);
    }

    public boolean getPiece(Spot intermediateSpot) {
        return false;
    }
}
