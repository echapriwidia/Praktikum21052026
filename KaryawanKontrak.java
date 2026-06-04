/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program KaryawanKontrak extends Karyawan
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public class KaryawanKontrak extends Karyawan{
     double honorKontrak;
    double uangMakan = 300000;

    public KaryawanKontrak(double honorKontrak, String nik, String nama) {
        super(nik, nama);
        this.honorKontrak = honorKontrak;
    }

   public void tampilKontrak() {
        tampilData();

        System.out.println("Honor Kontrak : " + honorKontrak);
        System.out.println("Uang Makan    : " + uangMakan);
        System.out.println("Total Gaji    : " + (honorKontrak + uangMakan));
    }
}
