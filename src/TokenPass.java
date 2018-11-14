public class TokenPass {


    private int[] board;
    private int currentPlayer;


    public TokenPass(int PlayerCount) {
        currentPlayer = (int)Math.random()*PlayerCount;
        board = new int[PlayerCount];
        for(int i =0; i<board.length; i++)
        {
            board[i] = (int) (Math.random() * 10);
        }
    }

    public void distributeCurrentPlayerTokens()
    {

        int numOfMaxTokens = board[currentPlayer];
        board[currentPlayer]=0;
        int nextPlayer = currentPlayer;

        while(numOfMaxTokens >0)
        {
            nextPlayer ++;
            board[nextPlayer] = board[nextPlayer] + 1;
            numOfMaxTokens--;
        }


    }
    public  int gameOver()
    {

    }
    



}