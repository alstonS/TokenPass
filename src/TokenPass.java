public class TokenPass {


    private int[] board;
    private int currentPlayer;

    public TokenPass(int PlayerCount) {

        board = new int[PlayerCount];
        for(int i =0; i<board.length; i++)
        {
            board[i] = (int) (Math.random() * 10);
        }


    }


}