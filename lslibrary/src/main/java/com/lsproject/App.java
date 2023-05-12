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
                double tol = 0;
                // Matrix provaA = new CCSMatrix(3, 3);
                // provaA.set(0, 0, 3);
                // provaA.set(0, 1, 1);
                // provaA.set(0, 2, 1);
                // provaA.set(1, 0, 1);
                // provaA.set(1, 1, 2);
                // provaA.set(1, 2, 1);
                // provaA.set(2, 0, 1);
                // provaA.set(2, 1, 1);
                // provaA.set(2, 2, 2);
                // Vector bIn = new BasicVector(new double[] { 5, 4, 4 });
                // Vector xIn = new BasicVector(new double[] { 1, 1, 1 });
                // LSSolver solv = new Gradienteconiugato(provaA, bIn, xIn);
                // System.out.println(provaA);
                // System.out.println(bIn);
                // System.out.println(xIn);
                // solv.executeMethods();

                // JACOBI

                // LSSolver lss = new Jacobi("lslibrary/src/main/java/com/Matrici/spa1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("JACOBI eseguito su spa1.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Jacobi("lslibrary/src/main/java/com/Matrici/spa2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("JACOBI eseguito su spa2.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Jacobi("lslibrary/src/main/java/com/Matrici/vem1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("JACOBI eseguito su vem1.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // // setMatrix();
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Jacobi("lslibrary/src/main/java/com/Matrici/vem2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("JACOBI eseguito su vem2.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // // setMatrix();
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }
                // System.out.println(
                // "____________________________________________________________________________________________________");

                // GRAUB SEIDEL

                // LSSolver lss = new
                // Graubseidel("lslibrary/src/main/java/com/Matrici/spa1.mtx");
                // System.out.println(

                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRAUB SEIDEL eseguito su spa1.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // // setMatrix();
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/spa2.mtx");
                // System.out.println(

                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GAUSS SEIDEL eseguito su spa2.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // // setMatrix();
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/vem1.mtx");
                // System.out.println(

                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GAUSS SEIDEL eseguito su vem1.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // // setMatrix();
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/vem2.mtx");
                // System.out.println(

                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GAUSS SEIDEL eseguito su vem2.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // GRADIENTE

                // LSSolver lss = new Gradiente("lslibrary/src/main/java/com/Matrici/spa1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE eseguito su spa1.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Gradiente("lslibrary/src/main/java/com/Matrici/spa2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE eseguito su spa2.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Gradiente("lslibrary/src/main/java/com/Matrici/vem1.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE eseguito su vem1.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // lss = new Gradiente("lslibrary/src/main/java/com/Matrici/vem2.mtx");
                // System.out.println(
                // "____________________________________________________________________________________________________");
                // System.out.println();
                // System.out.println("GRADIENTE eseguito su vem2.mtx");
                // System.out.println();
                // for (int t = 1; t < 5; t++) {
                // if (t == 1) {
                // tol = 1e-4;
                // lss.executeMethods(tol);
                // } else if (t == 2) {
                // tol = 1e-6;
                // lss.executeMethods(tol);
                // } else if (t == 3) {
                // tol = 1e-8;
                // lss.executeMethods(tol);
                // } else {
                // tol = 1e-10;
                // lss.executeMethods(tol);
                // }
                // }

                // GRADIENTE CONIUGATO

                LSSolver lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/spa1.mtx");
                System.out.println(
                                "____________________________________________________________________________________________________");
                System.out.println();
                System.out.println("GRADIENTE CONIUGATO eseguito su spa1.mtx");
                System.out.println();
                for (int t = 1; t < 5; t++) {
                        if (t == 1) {
                                tol = 1e-4;
                                lss.executeMethods(tol);
                        } else if (t == 2) {
                                tol = 1e-6;
                                lss.executeMethods(tol);
                        } else if (t == 3) {
                                tol = 1e-8;
                                lss.executeMethods(tol);
                        } else {
                                tol = 1e-10;
                                lss.executeMethods(tol);
                        }
                }
                lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/spa2.mtx");
                System.out.println(
                                "____________________________________________________________________________________________________");
                System.out.println();
                System.out.println("GRADIENTE CONIUGATO eseguito su spa2.mtx");
                System.out.println();
                for (int t = 1; t < 5; t++) {
                        if (t == 1) {
                                tol = 1e-4;
                                lss.executeMethods(tol);
                        } else if (t == 2) {
                                tol = 1e-6;
                                lss.executeMethods(tol);
                        } else if (t == 3) {
                                tol = 1e-8;
                                lss.executeMethods(tol);
                        } else {
                                tol = 1e-10;
                                lss.executeMethods(tol);
                        }
                }
                lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/vem1.mtx");
                System.out.println(
                                "____________________________________________________________________________________________________");
                System.out.println();
                System.out.println("GRADIENTE CONIUGATO eseguito su vem1.mtx");
                System.out.println();
                for (int t = 1; t < 5; t++) {
                        if (t == 1) {
                                tol = 1e-4;
                                lss.executeMethods(tol);
                        } else if (t == 2) {
                                tol = 1e-6;
                                lss.executeMethods(tol);
                        } else if (t == 3) {
                                tol = 1e-8;
                                lss.executeMethods(tol);
                        } else {
                                tol = 1e-10;
                                lss.executeMethods(tol);
                        }
                }
                lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/vem2.mtx");
                System.out.println(
                                "____________________________________________________________________________________________________");
                System.out.println();
                System.out.println("GRADIENTE CONIUGATO eseguito su vem2.mtx");
                System.out.println();
                for (int t = 1; t < 5; t++) {
                        if (t == 1) {
                                tol = 1e-4;
                                lss.executeMethods(tol);
                        } else if (t == 2) {
                                tol = 1e-6;
                                lss.executeMethods(tol);
                        } else if (t == 3) {
                                tol = 1e-8;
                                lss.executeMethods(tol);
                        } else {
                                tol = 1e-10;
                                lss.executeMethods(tol);
                        }
                }
        }
}
