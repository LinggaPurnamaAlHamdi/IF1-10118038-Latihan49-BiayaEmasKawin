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
public class Emas {
    private double berat;
    private final double harga = 570000;

    public double getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }    
    
    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double totalBayar(double berat) {
        return harga*berat;
    }
    
}
