package com.lsproject.lsclass;

import java.io.IOException;
import org.la4j.*;
import org.la4j.vector.dense.BasicVector;

public class Gradienteconiugato extends LSSolver {
    Vector residuo;
    Vector p;

    public Gradienteconiugato(String str) throws IOException {
        super(str);
        residuo = b.subtract(a.multiply(new BasicVector(new double[sol.length()])));
        p = residuo;
    }

    public Gradienteconiugato(Matrix aIn, Vector bIn, Vector xIn) {
        super(aIn, bIn, xIn);
        residuo = b.subtract(a.multiply(new BasicVector(new double[b.length()])));
        p = residuo;
    }

    public void reset() {
        residuo = b.subtract(a.multiply(new BasicVector(new double[sol.length()])));
        p = residuo;
    }

    public Vector risoluzione(Vector xVecchio) {
        Double alpha = prodottoScalare(p, residuo) / prodottoScalare(p, a.multiply(p));
        solutionX = xVecchio.add(p.multiply(alpha));
        residuo = b.subtract(a.multiply(solutionX));
        Double betha = prodottoScalare(p, a.multiply(residuo)) / prodottoScalare(p, a.multiply(p));
        p = residuo.subtract(p.multiply(betha));
        return solutionX;
    }
}
