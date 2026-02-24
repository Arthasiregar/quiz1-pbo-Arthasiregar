package driver;

import java.util.Scanner;
import model.solution;

public class Driver1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPembayaran = 0;

        System.out.println("Menu\t\tPorsi\tHarga\tTotal");
        System.out.println("==============================================");

        while (true) {

            String kode = sc.next();

            if (kode.equals("END")) {
                break;
            }

            int porsiButet = sc.nextInt();
            int porsiUcok = porsiButet * 2; // karena 100kg : 50kg = 2:1
            int totalPorsi = porsiButet + porsiUcok;

            String nama = solution.getNama(kode);
            int harga = solution.getHarga(kode);

            int total = harga * totalPorsi;
            totalPembayaran += total;

            System.out.println(nama + "\t" + totalPorsi + "\t" + harga + "\t" + total);
        }

        System.out.println("==============================================");
        System.out.println("Total Pembayaran\t\t" + totalPembayaran);
        System.out.println("Kupon\t\t\t" + solution.getKupon(totalPembayaran));
    }
}
