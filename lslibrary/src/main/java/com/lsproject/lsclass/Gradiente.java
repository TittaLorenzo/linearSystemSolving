package com.lsproject.lsclass;

import java.io.IOException;
import org.la4j.*;

public class Gradiente extends LSSolver {

    public Gradiente(int maxinumIteration, double tollerance, String str) throws IOException {
        super(maxinumIteration, tollerance, str);
    }

    public Gradiente(String str) throws IOException {
        this(20000, 1e-4, str);
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
