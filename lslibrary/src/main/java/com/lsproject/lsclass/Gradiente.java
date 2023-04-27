package com.lsproject.lsclass;

import java.io.IOException;
import org.la4j.*;

public class Gradiente extends LSSolver {

    public Gradiente(String str) throws IOException {
        super(str);
    }

    public Gradiente(Matrix aIn, Vector bIn, Vector xIn) {
        super(aIn, bIn, xIn);
    }

    public void reset() {

    }

    public Vector risoluzione(Vector xVecchio) {
        Vector residuo = b.subtract(a.multiply(xVecchio));
        Vector y = a.multiply(residuo);
        Double va = prodottoScalare(residuo, residuo);
        Double vb = prodottoScalare(residuo, y);
        Double alpha = va / vb;
        solutionX = xVecchio.add(residuo.multiply(alpha));
        return solutionX;
    }
}
