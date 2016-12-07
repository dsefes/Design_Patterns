package matrix;

public class MatrixStatistic {
    IMatrix matr;
    public MatrixStatistic(IMatrix matr) {
        this.matr = matr;
    }
    
    public int getSum(){
        int sum = 0;
        
        for (int j = 0; j < matr.getRaws(); j++){
            for (int i = 0; i < matr.getColomns(); i++){
                sum += matr.get(i, j);
            }
        }
        
        return sum;
    }
    
    public double getAvg(){
        double sum = getSum();
        return ((double) sum) / ((matr.getColomns() * matr.getRaws()));
    }
    
    public int getMax(){
        int max = matr.get(0, 0);
        
        for (int j = 0; j < matr.getRaws(); j++){
            for (int i = 0; i < matr.getColomns(); i++){
                if (matr.get(i, j) > max){
                    max = matr.get(i, j);
                }
            }
        }

        return max;
    }
    
    public int getNotNullNumber(){
        int number = 0;
        for (int j = 0; j < matr.getRaws(); j++){
            for (int i = 0; i < matr.getColomns(); i++){
                if (matr.get(i, j) != 0){
                    number++;
                }
            }
        }
        return number;
    }
}
