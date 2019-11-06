/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan49.biayaemaskawin;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Total
 *                     Biaya Emas Kawin
 */
public class IF110118038Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas();
        emas.setBerat(15.7);
        System.out.println("Harga Emas 1 gram : Rp." + emas.getHarga());
        System.out.printf("Berat emas  : %1.1f gram\n", emas.getBerat());
        System.out.println("Total Bayar : Rp." + emas.totalBayar(emas.getBerat()));
        System.out.println("\nTotal Bayar yang harus dikeluarkan oleh Hendi adalah Rp." + emas.totalBayar(emas.getBerat()));
    }
    
}
