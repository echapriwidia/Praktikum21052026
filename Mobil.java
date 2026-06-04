/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program Mobil extends Kendaraan
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public class Mobil extends Kendaraan {
   int  biayaRental = 500000;

    public Mobil(String noPolisi) {
        super(noPolisi);
    }

    public double getBiayaRental() {
        return biayaRental;
    }

    public void setBiayaRental(double biayaRental) {
        this.biayaRental = (int) biayaRental;
    }
    
    public void tampilMobil(){
        tampilData();
        System.out.println("Biaya Rental Mobil : " + biayaRental);
    }

    @Override
    public void biayaRental() {
    }
  
}
