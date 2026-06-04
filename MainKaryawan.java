/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program MainKaryawan
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public class MainKaryawan {

    public static void main(String[] args) {

    System.out.println("=== KARYAWAN TETAP ===");
    
    KaryawanTetap karyawantetap = new KaryawanTetap(3, 0, 0, "12345678", "Rindiani");
   
    karyawantetap.tampilTetap();


    System.out.println("\n=== KARYAWAN KONTRAK ===");
    
   
    KaryawanKontrak karyawankontrak = new KaryawanKontrak(2500000, "200", "Doni");
    karyawankontrak.tampilKontrak();
    
    }
}
