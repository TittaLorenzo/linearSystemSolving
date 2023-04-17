package com.lsproject;

import com.lsproject.lsclass.LSSolver;

import java.io.IOException;

import com.lsproject.lsclass.Jacobi;

public class App {
    public static void main(String[] args) throws IOException {
        LSSolver lss = new Jacobi("lslibrary/src/main/java/com/Matrici/spa1.mtx");
        System.out.println("____________________________________________________________________________________________________");
        System.out.println();
        System.out.println("JACOBI eseguito su spa1.mtx");
        System.out.println();
        lss.executeMethods();
        System.out.println("____________________________________________________________________________________________________");
        lss = new Jacobi("lslibrary/src/main/java/com/Matrici/spa2.mtx");
        System.out.println("____________________________________________________________________________________________________");
        System.out.println();
        System.out.println("JACOBI eseguito su spa2.mtx");
        System.out.println();
        lss.executeMethods();
        System.out.println("____________________________________________________________________________________________________");
        lss = new Jacobi("lslibrary/src/main/java/com/Matrici/vem1.mtx");
        System.out.println("____________________________________________________________________________________________________");
        System.out.println();
        System.out.println("JACOBI eseguito su vem1.mtx");
        System.out.println();
        lss.executeMethods();
        System.out.println("____________________________________________________________________________________________________");
        lss = new Jacobi("lslibrary/src/main/java/com/Matrici/vem2.mtx");
        System.out.println("____________________________________________________________________________________________________");
        System.out.println();
        System.out.println("JACOBI eseguito su vem.mtx");
        System.out.println();
        lss.executeMethods();
        System.out.println("____________________________________________________________________________________________________");
    }
}
