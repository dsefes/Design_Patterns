package matrix;

import java.util.ArrayList;
import java.util.Random;

public class MatrixInitiator {

    private MatrixInitiator(){
    }
    
    private static Random r = new Random(System.currentTimeMillis());
    public static void fillMatrix(IMatrix matr, int notNullNumber, int maxValue){
        ArrayList<Integer> indexes = new ArrayList<>(matr.getColomns()*matr.getRaws());
        for (int i = 0; i < matr.getColomns()*matr.getRaws(); i++){
            indexes.add(i);
        }
        
        for (; indexes.size() - notNullNumber > 0;){
            int ind = indexes.remove(r.nextInt(indexes.size()));
            int x = ind % matr.getColomns();
            int y = ind / matr.getColomns();
            matr.set(x, y, (r.nextInt(maxValue) + 1));
        }
    }
}
