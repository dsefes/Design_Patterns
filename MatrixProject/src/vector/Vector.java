package vector;

public class Vector implements IVector {

    private int[] elements;
    private int size;
    
    public Vector(int size) {
        elements = new int[size];
        this.size = size;
    }
    @Override
    public int get(int index) {
        return elements[index];
    }

    @Override
    public void set(int index, int value) {
        elements[index] = value;
    }

    @Override
    public int size() {
        return size;
    }

}
