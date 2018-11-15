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
        System.out.println(currentPlayer);
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
    public int gameOver()
    {
        for(int i = 0; i <board.length; i++)
        {
            if(board[i] <= 0)
            {
                return 1;
            }
        }
        return currentPlayer;
    }
    public String printBoard()
    {
        String printOut = "Player";
        for(int j=0; j<board.length; j++)
        {
            printOut = printOut + j +":"+ board[j] + "\n";
        }
        return printOut;
    }
    public void nextPlayer()
    {
        currentPlayer++;
    }
}