package matrix;

import vector.IVector;
import vector.SparseVector;

public class SparseMatrix extends AMatrix {

    public SparseMatrix(int colomns, int raws) {
        super(colomns, raws);
    }

    @Override
    protected IVector getVector(int size) {
        return new SparseVector(size);
    }

}
