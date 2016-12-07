package vector;

import java.util.ArrayList;

public class SparseVector implements IVector {

    private ArrayList<Integer> elements;
    private ArrayList<Integer> indexes;
    private int size;
    
    public SparseVector(int size) {
        elements = new ArrayList<>();
        indexes = new ArrayList<>();
        this.size = size;
    }
    
    @Override
    public int get(int index) {
        indexVerification(index);
        if (!indexes.contains(index)){
            return 0;
        }
        
        return elements.get(indexes.indexOf(index));
    }

    @Override
    public void set(int index, int value) {
        indexVerification(index);
        if (!indexes.contains(index)){
            indexes.add(index);
            elements.add(value);
        } else {
            elements.set(indexes.indexOf(index), value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    private void indexVerification(int index){
        if (index >= size){
            throw new ArrayIndexOutOfBoundsException("Required index (" + index + ") more than array size (" + size + ")");
        }
    }
}
