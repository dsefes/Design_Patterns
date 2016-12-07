package main;

import matrix.IMatrix;
import matrix.Matrix;
import matrix.MatrixInitiator;
import matrix.MatrixStatistic;
import matrix.SparseMatrix;

public class MainClass {
    public static void main(String[] args) {
        initMatr(new Matrix(3, 2));
        initMatr(new SparseMatrix(3,2));
    }
    
    public static void initMatr(IMatrix matr){
        MatrixInitiator.fillMatrix(matr, 2, 10);
        matr.printMatrix();
        
        MatrixStatistic ms = new MatrixStatistic(matr);
        System.out.println("sum     = " + ms.getSum());
        System.out.println("avg     = " + ms.getAvg());
        System.out.println("max     = " + ms.getMax());
        System.out.println("notNull = " + ms.getNotNullNumber());
    }
}
