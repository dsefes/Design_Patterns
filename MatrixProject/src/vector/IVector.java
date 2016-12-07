package vector;

public interface IVector {
    int  get(int index);
    void set(int index, int value);
    
    int size();
    
    default void printVector(){
        for (int i = 0; i < size(); i++){
            System.out.print(get(i) + " ");
        }
    }
}
