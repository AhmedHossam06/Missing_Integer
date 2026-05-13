/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1, 2, 3};
        int[] C = {-1, -2};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int N = sc.nextInt();

        
        if (N < 1 || N > 100000) {
            System.out.println("Array size must be between 1 and 100000");
            return;
        }

        int[] d = new int[N];

        System.out.println("Enter array elements:");

        for (int i = 0; i < N; i++) {

            d[i] = sc.nextInt();

            
            if (d[i] < -1000000 || d[i] > 1000000) {
                System.out.println(
                    "Elements must be between -1000000 and 1000000"
                );
                return;
            }
        }

        System.out.println("User Array:");
        System.out.println(
            "Non Recursive: " +
            MissingIntegerNonRecursive.findMissing(d)
        );

        System.out.println(
            "Recursive: " +
            MissingIntegerRecursive.findMissing(d)
        );
    

        
        System.out.println("\nArray A:");
        System.out.println("Non Recursive: " +
                MissingIntegerNonRecursive.findMissing(A));

        System.out.println("Recursive: " +
                MissingIntegerRecursive.findMissing(A));

        System.out.println("\nArray B:");
        System.out.println("Non Recursive: " +
                MissingIntegerNonRecursive.findMissing(B));

        System.out.println("Recursive: " +
                MissingIntegerRecursive.findMissing(B));

        System.out.println("\nArray C:");
        System.out.println("Non Recursive: " +
                MissingIntegerNonRecursive.findMissing(C));

        System.out.println("Recursive: " +
                MissingIntegerRecursive.findMissing(C));
    }
}
