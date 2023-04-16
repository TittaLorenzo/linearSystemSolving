package com.lsproject;

import com.lsproject.lsclass.LSSolver;

import java.io.IOException;

import com.lsproject.lsclass.Jacobi;

public class App {
    public static void main(String[] args) throws IOException {
        LSSolver lss = new Jacobi();
        lss.executeMethods();
    }
}
