/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program abstract class Kendaraan 
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
 public abstract class Kendaraan {
    protected String noPolisi;

    public Kendaraan(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }
    

    public void tampilData() {
        System.out.println("No Polisi : " + noPolisi);
    }
  
    public abstract void biayaRental();

}
