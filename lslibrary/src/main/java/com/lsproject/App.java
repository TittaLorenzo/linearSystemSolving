package com.lsproject;

import com.lsproject.lsclass.LSSolver;
import com.lsproject.lsclass.Jacobi;
public class App {
    public static void main(String[] args) {
        LSSolver lss = new Jacobi();
        lss.executeMethods();
    }
}
