package ru.vsu.cs.baturin_v_a;

public class Main {

    public static void main(String[] args) {
        int[] arrToSort = new int[] {7, 10, 3, 8, 7, 2, 1, 9, 5, 7};
        boolean[] arrFixed = new boolean[] {false, true, false, false, true, true,  false, false, true, false};

        SelectionSorter.sort(arrToSort, arrFixed);

        for (int j : arrToSort) {
            System.out.print(j + " ");
        }
    }
}
