public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        String res = game.playGame();
        if(res == "Tie"){
            System.out.println("It's a tie.");
        }
        else{
            System.out.println("Winner is: " + res);
        }
    }
}
