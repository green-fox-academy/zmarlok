//Create a function named `isSymmetric`
//that takes an n×n integer matrix (two dimensional array/list) as a parameter
//and returns true if the matrix is symmetric
//or false if it is not.
//(Symmetric means it has identical values along its diagonal axis from top-left to bottom-right,
//as in the first example)
//
//Example 1:
//
//[
//  [1, 0, 1],
//  [0, 2, 2],
//  [1, 2, 5]
//]
//
//Output:
//
//true
//
//Example 2:
//
//[
//  [7, 7, 7],
//  [6, 5, 7],
//  [1, 2, 1]
//]
//
//Output:
//
//false

package symmetricmatrix;

public class Main {

    public static void main(String[] args) {

        int[][] matrixOne = {
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}
        };

        int[][] matrixTwo = {
                {7, 7, 7},
                {6, 5, 7},
                {1, 2, 1}
        };

        int [][] matrixThree = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,4,5},
                {4,5,5,4},
        };

        System.out.println("Matrix one is symmetric. This statement is: " +isSymmetric(matrixOne));
        System.out.println("Matrix two is symmetric. This statement is: " +isSymmetric(matrixTwo));
        System.out.println("Matrix three is symmetric. This statement is: " +isSymmetric(matrixThree));

    }


    public static boolean isSymmetric(int matrixToInspect[][]) {

        for (int i = 0; i < matrixToInspect.length; i++) {
            for (int j = 0; j < matrixToInspect.length; j++) {
                if (matrixToInspect[i][j] != matrixToInspect[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

