package model;

public class solution {
    
    // ================= DRIVER 1 ================= //

    public static String getNama(String kode) {
        switch (kode) {
            case "NGS": return "Nasi Goreng Spesial";
            case "AP": return "Ayam Penyet";
            case "SA": return "Sate Ayam";
            case "BU": return "Bakso Urat";
            case "MAP": return "Mie Ayam Pangsit";
            case "GG": return "Gado-Gado";
            case "SAM": return "Soto Ayam";
            case "RD": return "Rendang Daging";
            case "IB": return "Ikan Bakar";
            case "NUK": return "Nasi Uduk Komplit";
            default: return null;
        }
    }

    public static int getHarga(String kode) {
        switch (kode) {
            case "NGS": return 25000;
            case "AP": return 20000;
            case "SA": return 30000;
            case "BU": return 22000;
            case "MAP": return 18000;
            case "GG": return 15000;
            case "SAM": return 17000;
            case "RD": return 30000;
            case "IB": return 28000;
            case "NUK": return 23000;
            default: return 0;
        }
    }

    public static String getKupon(int total) {
        if (total >= 500000) return "Kupon Hitam (25%)";
        else if (total >= 400000) return "Kupon Hijau (20%)";
        else if (total >= 300000) return "Kupon Merah (15%)";
        else if (total >= 200000) return "Kupon Kuning (10%)";
        else if (total >= 100000) return "Kupon Biru (5%)";
        else return "-";
    }

    // ================= DRIVER 2 ================= //

    public int hitungTotalKelompok(int[] nilai, int kodeKelompok) {

        int index = 0;
        int kelompok = 1;
        int total = 0;

        while (index < nilai.length) {

            int jumlahAnggota = kelompok;

            if (kelompok == kodeKelompok) {
                for (int i = 0; i < jumlahAnggota && index < nilai.length; i++) {
                    total += nilai[index];
                    index++;
                }
                break;
            } else {
                index += jumlahAnggota;
            }

            kelompok++;
        }

        return total;
    }

// Driver 3 //

public static String prosesLaundry(
            String nama,
            String asrama,
            int baju,
            int celana,
            int jaket) {

        int total = baju + celana + jaket;

        String output = "";
        output += "=== SISTEM LAUNDRY DEL ===\n";
        output += "Mahasiswa : " + nama + "\n";
        output += "Asrama    : " + asrama + "\n";
        output += "Total Item: " + total + "\n";
        output += "Status    : MENUNGGU_JEMPUT\n";

        output += "-> Laundry dijemput\n";
        output += "-> Laundry dicek (Total sesuai: " + total + " item)\n";
        output += "-> Laundry dicuci\n";
        output += "-> Laundry selesai\n";
        output += "-> Laundry diantar ke " + asrama + "\n";
        output += "Status Akhir: DIANTAR\n";

        return output;
    }
}