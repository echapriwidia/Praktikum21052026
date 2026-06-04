/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program Pembayaran Transfer extends Pembayaran
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public class PembayaranTransfer extends Pembayaran{
    private String namaBank;

    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Proses pembayaran secara transfer");
        System.out.println("Nama Bank : "+namaBank);
        System.out.println("Id Transaksi : "+idTransaksi);
        System.out.println("Total bayar : "+jumlahBayar);
    }
}
