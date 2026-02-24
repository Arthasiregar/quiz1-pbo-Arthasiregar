package driver;

import java.util.Scanner;
import model.solution;

public class Driver2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nilai = new int[N];

        for (int i = 0; i < N; i++) {
            nilai[i] = sc.nextInt();
        }

        int kodeKelompok = sc.nextInt();

        solution sol = new solution();
        int hasil = sol.hitungTotalKelompok(nilai, kodeKelompok);

        System.out.println(hasil);
    }
}