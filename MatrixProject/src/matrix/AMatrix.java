package matrix;

import vector.IVector;

public abstract class AMatrix implements IMatrix {

    int colomns, raws;
    IVector[] elements;
    
    public AMatrix(int colomns, int raws) {
        this.colomns = colomns;
        this.raws = raws;
        elements = new IVector[raws];
        for (int i = 0; i < elements.length; i++){
            elements[i] = getVector(colomns);
        }
    }
    
    abstract protected IVector getVector(int size);
    
    @Override
    public int get(int i, int j) {
        indexVerification(i, j);
        return elements[j].get(i);
    }

    @Override
    public void set(int i, int j, int value) {
        indexVerification(i, j);
        elements[j].set(i, value);
    }

    @Override
    public int getRaws() {
        return raws;
    }

    @Override
    public int getColomns() {
        return colomns;
    }

    private void indexVerification(int i, int j){
        if (i > colomns || j > raws){
            throw new ArrayIndexOutOfBoundsException("Required index (" + i + ", " + j
                    + ") more than actual matrix size (" + colomns + ", " + raws + ")");
        }
    }
}
