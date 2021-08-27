import java.util.Scanner;
public class q3 {
    int row=3,col=3;
    char[][] board= new char[row][col];
    char player = 'X';
    public static void main(String[] args){
        q3 game = new q3();
        game.dataBoard();
        game.gameStart();
    }
    public  void gameStart(){
        displayBoard();
        inputRC();
        inputBoard();
        gameStart();
    }
    public void inputBoard(){
        board[row-1][col-1] = player;
        changPlayer();
    }
    public  void changPlayer(){
        player = player == 'O' ? 'X' : 'O';
    }
    public  void inputRC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("row 1-3 : ");
        row = sc.nextInt();
        System.out.print("col 1-3 : ");
        col = sc.nextInt();
    }
    public  void dataBoard(){
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                board[r][c] = ' ';
            }
        }
    }
    public  void displayBoard(){
        for(int i=0;i<3;i++){
            System.out.println( "|"+board[i][0] + "|" + board[i][1] + "|" + board[i][2] + "|");
        }
    }

}
