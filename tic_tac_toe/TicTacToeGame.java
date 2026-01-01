import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;
    
    public TicTacToeGame(){
        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player p1 = new Player("Player1", crossPiece);
        PlayingPieceO naughtsPiece = new PlayingPieceO();
        Player p2 = new Player("Player2", naughtsPiece);
        players.add(p1);
        players.add(p2);
        gameBoard = new Board(3);
    }

    public String playGame(){
        boolean noWinner = true;
        
        while(noWinner){

            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();

            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println(playerTurn.name + " enter row,column: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int ipRow = Integer.valueOf(values[0]);
            int ipCol = Integer.valueOf(values[1]);

            boolean pieceAdded = gameBoard.addPiece(ipRow, ipCol, playerTurn.playingPiece);
            if(!pieceAdded){
                System.out.println("Incorrect position. Try again!");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean isWinner = checkWinner(ipRow, ipCol, playerTurn.playingPiece.pieceType);
            if(isWinner){
                return playerTurn.name;
            }
        }

        return "Tie";
    }

    public boolean checkWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
                break;
            }
        }

        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }

        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
