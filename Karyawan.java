/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program abstract class Karyawan
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public abstract class Karyawan {
   
    protected String nik;
    protected String nama;
    
    public Karyawan(){
    
    }

    public Karyawan(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public void tampilData() {
        System.out.println("NIK  : " + nik);
        System.out.println("Nama : " + nama);
    } 
}
