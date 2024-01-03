import java.util.*;
class TicTacToe{
    static char[][] board = new char[3][3];
    TicTacToe(){
        board = new char[3][3];
        initialize();
    }
    void initialize(){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j <board[i].length ;j++){
                board[i][j] = ' ';
            }
        }
    }
    static void display(){
        System.out.println("----------------");
        for(int i = 0 ; i < board.length;i++){
            System.out.print(" | ");
            for(int j = 0 ; j < board.length ;j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("----------------");
        }
    }
    static void mark(int row,int col,char mark){
        if(row >= 0 && row <= board.length - 1 && col >= 0 && col <= board.length - 1 ){
            board[row][col] = mark;
        }
        else 
        {
            System.out.println("Sorry.....Invalid Input");
        }
        
    }
    static boolean rowWin(){
        for(int i = 0 ; i < board.length;i++)
        {
            if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;
            }     
        }
        return false;
    }
    static boolean colWin(){
        for(int j = 0 ; j < board.length ; j++){
            if(board[0][j]  != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j] ){
                return true;
            }
        }
        return false ;
    }
    static boolean diagonalWin(){
        for(int i = 0 ; i < board.length ;i++){
            for(int j = 0 ; j < board.length ;j++){
                if(board[i][2] != ' ' &&  i==j&& i+j == board.length - 1){
                    return true;
                }
            }
        }
         return false ;
    }

}
public class Main{
    public static void main(String[] args){
        TicTacToe t = new TicTacToe();
        Player p1 = new Player("Shiva",'X');
        Player p2 = new Player("Vishwa",'O');
        Player cp ;
        cp = p1 ;
        while(true){
        System.out.println(cp.name + " turn");
        cp.makeMove();
        TicTacToe.display();
        if(TicTacToe.colWin() || TicTacToe.rowWin() || TicTacToe.diagonalWin())
        {
            System.out.println(cp.name + " has won");
            break;
        }
        else
        {
            if(cp == p1)
            {
                cp = p2 ;
            }
            else
            {
                cp = p1 ;
            }
        }
        }
    }
}

class Player
{
    String name;
    char mark;

    Player(String name ,char mark){
        this.name = name ;
        this.mark = mark ;
    }

    void makeMove()
    {
        Scanner scan = new Scanner(System.in);
        int row,col;
        do{
        System.out.println("Enter the Row and Col");
         row = scan.nextInt();
         col = scan.nextInt();
        }while(!isValidMove(row, col));

        TicTacToe.mark(row, col, mark);
    }

    static boolean isValidMove(int row , int col)
    {
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2){
            if(TicTacToe.board[row][col] == ' '){
                return true ;
            }
        }
        return false ;
    }
}