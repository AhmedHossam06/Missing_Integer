/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DarTech
 */
import java.util.*;

public class MissingIntegerNonRecursive {

    public static int findMissing(int[] A) {
        int N = A.length;
        boolean[] present = new boolean[N + 1];

        for (int i = 0; i < N; i++) {
            if (A[i] > 0 && A[i] <= N) {
                present[A[i]] = true;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return N + 1;
    }
}