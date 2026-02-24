package driver;

import java.util.Scanner;
import model.solution;

public class Driver3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Asrama         : ");
        String asrama = sc.nextLine();

        System.out.print("Jumlah Baju   : ");
        int baju = sc.nextInt();

        System.out.print("Jumlah Celana : ");
        int celana = sc.nextInt();

        System.out.print("Jumlah Jaket  : ");
        int jaket = sc.nextInt();

        String hasil = solution.prosesLaundry(
                nama,
                asrama,
                baju,
                celana,
                jaket
        );

        System.out.println();
        System.out.println(hasil);

        sc.close();
    }
}