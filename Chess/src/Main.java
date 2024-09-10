public class Main{
    public static void main (String[] args){
        Game game = new Game();

        //start the game loop
        while(true){
            //display current state of the board
            game.printBoard();

            //get the current player's move
            Move move = game.getCurrentPlayer();

            //apply the move to the board
            game.applyMove(move);

            //check if game is over
            if (game.isGameOver()){
                //display game results
                game.printStatus();
                break;
            }
            //switch turns

        Board board = new Board();
        boolean isWhiteTurn =  true;




        }
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            