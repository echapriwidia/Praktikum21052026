/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program Bus extends Kendaraan
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
   public class Bus extends Kendaraan {
    double biaya = 800000;

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public Bus(String noPolisi) {
        super(noPolisi);
    }
    public void tampilBus(){
        tampilData();
        System.out.println("Biaya Rental Bus : " + biaya);
    
    }
     
    @Override
    public void biayaRental() {
      
    }

} 
