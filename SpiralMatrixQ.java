import java.util.*;
public class SpiralMatrixQ{
    public static void printSpiral(int mat[][]){ // isse esa visualise karneka aadat daal thoda mat[row][column]
        int sRow,eRow,sCol,eCol;
        sRow = 0;
        eRow = mat.length - 1;
        sCol = 0;
        eCol = mat[0].length - 1;
        int count = 0;
        while(count != (eRow+1)*(eCol+1) ){ // yaha number of elements hi count hoga so use m*n logic
            for(int i = sCol; i <= eCol; i++){
                System.out.print(mat[sRow][i] + " ");
                count++;
            }
            for(int i = sRow+1; i <= eRow; i++){
                System.out.print(mat[i][eCol] + " ");
                count++;
            }
            for(int i = eCol-1; i >= sCol; i--){
                System.out.print(mat[eRow][i] + " ");
                count++;
            }
            for(int i = eRow-1; i >= sRow+1; i--){
                System.out.print(mat[i][sCol] + " ");
                count++;
            }
            sRow++; //sr = 1
            eRow--; //er = 2
            sCol++; //sc = 1
            eCol--; //ec = 2
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printSpiral(matrix);
    }
    
}
//{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}