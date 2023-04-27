package com.lsproject;

import com.lsproject.lsclass.LSSolver;

import java.io.IOException;

import com.lsproject.lsclass.Gradiente;
import com.lsproject.lsclass.Gradienteconiugato;
import com.lsproject.lsclass.Graubseidel;
import com.lsproject.lsclass.Jacobi;
import org.la4j.*;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.sparse.CCSMatrix;
import org.la4j.vector.dense.BasicVector;

public class App {
        public static void main(String[] args) throws IOException {
                Matrix provaA = new CCSMatrix(3, 3);
                provaA.set(0, 0, 3);
                provaA.set(0, 1, 1);
                provaA.set(0, 2, 1);
                provaA.set(1, 0, 1);
                provaA.set(1, 1, 2);
                provaA.set(1, 2, 1);
                provaA.set(2, 0, 1);
                provaA.set(2, 1, 1);
                provaA.set(2, 2, 2);
                Vector bIn = new BasicVector(new double[] { 5, 4, 4 });
                Vector xIn = new BasicVector(new double[] { 1, 1, 1 });
                LSSolver solv = new Gradienteconiugato(provaA, bIn, xIn);
                System.out.println(provaA);
                System.out.println(bIn);
                System.out.println(xIn);
                solv.executeMethods();

                // JACOBI

                // LSSolver lss = new Jacobi("lslibrary/src/main/java/com/Matrici/spa1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("JACOBI eseguito su spa1.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Jacobi("lslibrary/src/main/java/com/Matrici/spa2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("JACOBI eseguito su spa2.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Jacobi("lslibrary/src/main/java/com/Matrici/vem1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("JACOBI eseguito su vem1.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Jacobi("lslibrary/src/main/java/com/Matrici/vem2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("JACOBI eseguito su vem2.mtx");
                // System.out.println();
                // lss.executeMethods();
                // System.out.println(
                // "____________________________________________________________________________________________________");

                // GAUSS SEIDEL

                // lss = new
                // Graubseidel("lslibrary/src/main/java/com/Matrici/spa1.mtx");
                // System.out.println(

                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GAUSS SEIDEL eseguito su spa1.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/spa2.mtx");
                // System.out.println(

                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GAUSS SEIDEL eseguito su spa2.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/vem1.mtx");
                // System.out.println(

                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GAUSS SEIDEL eseguito su vem1.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/vem2.mtx");
                // System.out.println(

                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GAUSS SEIDEL eseguito su vem2.mtx");
                // System.out.println();
                // lss.executeMethods();

                // GRADIENTE

                // lss = new Gradiente("lslibrary/src/main/java/com/Matrici/spa1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE eseguito su spa1.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Gradiente("lslibrary/src/main/java/com/Matrici/spa2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE eseguito su spa2.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Gradiente("lslibrary/src/main/java/com/Matrici/vem1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE eseguito su vem1.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Gradiente("lslibrary/src/main/java/com/Matrici/vem2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE eseguito su vem2.mtx");
                // System.out.println();
                // lss.executeMethods();

                // GRADIENTE CONIUGATO

                // LSSolver lss = new
                // Gradienteconiugato("lslibrary/src/main/java/com/Matrici/spa1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE CONIUGATO eseguito su spa1.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/spa2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE CONIUGATO eseguito su spa2.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/vem1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE CONIUGATO eseguito su vem1.mtx");
                // System.out.println();
                // lss.executeMethods();

                // lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/vem2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE CONIUGATO eseguito su vem2.mtx");
                // System.out.println();
                // lss.executeMethods();
        }
}
