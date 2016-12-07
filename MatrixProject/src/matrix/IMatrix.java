package matrix;

public interface IMatrix {
    int get(int i, int j);
    void set(int i, int j, int value);
    
    int getRaws();
    int getColomns();
    
    default void printMatrix(){
        for (int j = 0; j < getRaws(); j++){
            for (int i = 0; i < getColomns(); i++){
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }
    }
}
