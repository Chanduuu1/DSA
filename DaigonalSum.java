import java.util.*;
public class DaigonalSum{
    // Brute Force O(n^2)
    public static void diagSum(int mat[][]){
        int rowSize = mat.length;
        int colSize = mat[0].length;
        int priSum = 0,secSum = 0;
        if(rowSize == colSize && rowSize % 2 == 0){
            for(int row = 0; row < rowSize; row++){
                for(int col = 0; col < colSize; col++){
                    if(row == col){
                        priSum += mat[row][col];
                    }
                    if(row+col == 3){
                        secSum += mat[row][col];
                    }
                }
            }
            int diagS = secSum + priSum;
            System.out.println(diagS);
        }
        else{
            for(int row = 0; row < rowSize; row++){
                for(int col = 0; col < colSize; col++){
                    if(row == col){
                        priSum += mat[row][col];
                    }
                    if(row+col == 3){
                        secSum += mat[row][col];
                    }
                }
            }
            int midIndex = (rowSize - 1)/2;
            int diagS = secSum + priSum;
            System.out.println(diagS - mat[midIndex][midIndex]);
        }
    }
    public static void diagSumOptimized(int mat[][]){
        for(int i = 0; i<mat.length; i++){
            //pd
            sum += mat[i][i];
            //sd
            sum += mat[i][mat.length-i-1];
        }
        // print karwa le abh
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        int matrix2[][] = {{1,2,3},
                          {5,6,7},
                          {9,10,11}};
        diagSum(matrix);
        diagSum(matrix2);
    }
}