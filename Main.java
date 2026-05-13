/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Main {

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1,2,3};
        int[] C = {-1,-2};
        System.out.println("Non Recursive: " + MissingIntegerNonRecursive.findMissing(A));
        System.out.println("Recursive: " + MissingIntegerRecursive.findMissing(A));
        System.out.println("Non Recursive: " + MissingIntegerNonRecursive.findMissing(B));
        System.out.println("Recursive: " + MissingIntegerRecursive.findMissing(B));
        System.out.println("Non Recursive: " + MissingIntegerNonRecursive.findMissing(C));
        System.out.println("Recursive: " + MissingIntegerRecursive.findMissing(C));
    }
}