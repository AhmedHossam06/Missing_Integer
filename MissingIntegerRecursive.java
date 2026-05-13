/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DarTech
 */
public class MissingIntegerRecursive {

    public static int findMissing(int[] A) {

        bubbleSort(A);

        return find(A, 0, 1);
    }

    private static void bubbleSort(int[] A) {

        int N = A.length;

        for (int i = 0; i < N - 1; i++) {

            for (int j = 0; j < N - i - 1; j++) {

                if (A[j] > A[j + 1]) {

                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    private static int find(int[] A, int index, int expected) {

        if (index >= A.length)
            return expected;

        if (A[index] == expected)

            return find(A, index + 1, expected + 1);

        else if (A[index] < expected)

            return find(A, index + 1, expected);

        else

            return expected;
    }
}