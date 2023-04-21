package com.lsproject;

import com.lsproject.lsclass.LSSolver;

import java.io.IOException;

import com.lsproject.lsclass.Gradiente;
import com.lsproject.lsclass.Gradienteconiugato;
import com.lsproject.lsclass.Graubseidel;
import com.lsproject.lsclass.Jacobi;

public class App {
    public static void main(String[] args) throws IOException {

        // JACOBI
        // /*
        //  * LSSolver lss = new Jacobi("lslibrary/src/main/java/com/Matrici/spa1.mtx");
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  * System.out.println();
        //  * System.out.println("JACOBI eseguito su spa1.mtx");
        //  * System.out.println();
        //  * lss.executeMethods();
        //  * 
        //  * lss = new Jacobi("lslibrary/src/main/java/com/Matrici/spa2.mtx");
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  * System.out.println();
        //  * System.out.println("JACOBI eseguito su spa2.mtx");
        //  * System.out.println();
        //  * lss.executeMethods();
        //  * 
        //  * lss = new Jacobi("lslibrary/src/main/java/com/Matrici/vem1.mtx");
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  * System.out.println();
        //  * System.out.println("JACOBI eseguito su vem1.mtx");
        //  * System.out.println();
        //  * lss.executeMethods();
        //  * 
        //  * lss = new Jacobi("lslibrary/src/main/java/com/Matrici/vem2.mtx");
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  * System.out.println();
        //  * System.out.println("JACOBI eseguito su vem2.mtx");
        //  * System.out.println();
        //  * lss.executeMethods();
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  */
        // //

        // // GAUSS SEIDEL
        // /*
        //  * LSSolver lss = new
        //  * Graubseidel("lslibrary/src/main/java/com/Matrici/spa1.mtx");
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  * System.out.println();
        //  * System.out.println("GAUSS SEIDEL eseguito su spa1.mtx");
        //  * System.out.println();
        //  * lss.executeMethods();
        //  * 
        //  * lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/spa2.mtx");
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  * System.out.println();
        //  * System.out.println("GAUSS SEIDEL eseguito su spa2.mtx");
        //  * System.out.println();
        //  * lss.executeMethods();
        //  * 
        //  * lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/vem1.mtx");
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  * System.out.println();
        //  * System.out.println("GAUSS SEIDEL eseguito su vem1.mtx");
        //  * System.out.println();
        //  * lss.executeMethods();
        //  * 
        //  * lss = new Graubseidel("lslibrary/src/main/java/com/Matrici/vem2.mtx");
        //  * System.out.println(
        //  * "____________________________________________________________________________________________________"
        //  * );
        //  * System.out.println();
        //  * System.out.println("GAUSS SEIDEL eseguito su vem2.mtx");
        //  * System.out.println();
        //  * lss.executeMethods();
        //  */

        //GRADIENTE

        LSSolver lss = new Gradiente("lslibrary/src/main/java/com/Matrici/spa2.mtx");
        System.out.println(
                "____________________________________________________________________________________________________");
        System.out.println();
        System.out.println("GRADIENTE eseguito su spa1.mtx");
        System.out.println();
        lss.executeMethods();

        //  //GRADIENTE CONIUGATO

        // LSSolver lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/spa1.mtx");
        // System.out.println(
        //         "____________________________________________________________________________________________________");
        // System.out.println();
        // System.out.println("GRADIENTE CONIUGATO eseguito su spa1.mtx");
        // System.out.println();
        // lss.executeMethods();

        // lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/spa2.mtx");
        // System.out.println(
        //         "____________________________________________________________________________________________________");
        // System.out.println();
        // System.out.println("GRADIENTE CONIUGATO eseguito su spa2.mtx");
        // System.out.println();
        // lss.executeMethods();

        // lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/vem1.mtx");
        // System.out.println(
        //         "____________________________________________________________________________________________________");
        // System.out.println();
        // System.out.println("GRADIENTE CONIUGATO eseguito su vem1.mtx");
        // System.out.println();
        // lss.executeMethods();

        // lss = new Gradienteconiugato("lslibrary/src/main/java/com/Matrici/vem2.mtx");
        // System.out.println(
        //         "____________________________________________________________________________________________________");
        // System.out.println();
        // System.out.println("GRADIENTE CONIUGATO eseguito su vem2.mtx");
        // System.out.println();
        // lss.executeMethods();
    }
}
