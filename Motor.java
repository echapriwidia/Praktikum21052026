/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program Motor extends Kendaraan
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public class Motor extends Kendaraan {
    double biaya = 250000;

    public Motor(String noPolisi) {
        super(noPolisi);
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    
   public void tampilMotor(){
        System.out.println("Biaya Rental Motor : " + biaya);
    }

   @Override
   public  void biayaRental() {
    }
}
