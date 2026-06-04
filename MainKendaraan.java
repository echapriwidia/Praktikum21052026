/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program MainKendaraan
 */
package Praktikum21052026;

import java.util.Scanner;

/**
 *
 * @author Echa2
 */
public class MainKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        System.out.println("=== DATA MOBIL ECHA ===");

        Mobil mobil = new Mobil("BR 1369 CHA");
         mobil.tampilMobil();

        System.out.println("\n=== DATA MOTOR ECHA ===");

        Motor motor = new Motor("BS 6789 DNA");
         motor.tampilMotor();

        System.out.println("\n=== DATA BUS ECHA ===");

        Bus bus = new Bus("BP 09876 AU");
        bus.tampilBus();
    }

}
