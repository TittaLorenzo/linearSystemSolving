package com.lsproject.lsclass;

import java.math.*;
import org.la4j.*;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.vector.dense.BasicVector;

public class Jacobi extends LSSolver{

    

    public Jacobi(int maxinumIteration, int tollerance) {
        super(maxinumIteration, tollerance);
    }

    public void execute(){
        super.tol = 1e-6;
        super.maxIter = 20000;

        //calcolo diagonale
        
    }
}