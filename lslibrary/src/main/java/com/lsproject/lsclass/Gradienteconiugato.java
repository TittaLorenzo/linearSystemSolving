package com.lsproject.lsclass;

import java.io.IOException;
import org.la4j.*;
import org.la4j.vector.dense.BasicVector;

public class Gradienteconiugato extends LSSolver {
    Vector residuo;
    Vector p;

    public Gradienteconiugato(int maxinumIteration, double tollerance, String str) throws IOException {
        super(maxinumIteration, tollerance, str);
        residuo = b.subtract(a.multiply(new BasicVector(new double[sol.length()])));
        p = residuo;
    }

    public Gradienteconiugato(String str) throws IOException {
        this(20000, 1e-4, str);
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
