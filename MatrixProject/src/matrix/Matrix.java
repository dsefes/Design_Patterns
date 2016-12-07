package matrix;

import vector.IVector;

public class Matrix extends AMatrix {

    public Matrix(int colomns, int raws) {
        super(colomns, raws);
    }

    @Override
    protected IVector getVector(int size) {
        return new vector.Vector(size);
    }

}
