import java.util.*;

public class Matrix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        
        int[][] mat = new int[row][col];
        //System.out.println(diagonalSum(mat));
        System.out.println(diagonalSumReverse(mat));
    }
    
      public static int diagonalSum(int[][] mat){
        Scanner scan = new Scanner(System.in);
        int sum = 0 ;
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[0].length ;j++){
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ;j++){
                if(i+j==mat.length - 1 ){
                 sum += mat[i][j] ;
                }
                else if(i+j == mat.length){
                    sum += mat[i][j];
                }
                else if(i+j == mat.length + 1){
                    sum += mat[i][j];
                }

            }
        }  
        return sum ;
    }
    public static int diagonalSumReverse(int[][] mat){
        Scanner scan = new Scanner(System.in);
        int sum = 0 ;
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[0].length ;j++){
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ;j++){
                if(i+j <=mat.length - 1 ){
                 sum += mat[i][j] ;
                }
                else if(i+j <= mat.length - 1){
                    sum += mat[i][j];
                }
                else if(i+j <= mat.length - 1){
                    sum += mat[i][j];
                }

            }
        }  
        return sum ;
    }

}