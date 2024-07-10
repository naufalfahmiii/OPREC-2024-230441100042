/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewahotel;

/**
 *
 * @author THINKPAD
 */
public class Deluxe extends Kamar{
    public String tipeKamar;
    public float hargakamar;
    public String namaPenyewa;
    
    @Override
    void tipe(){
        System.out.println("Ini Deluxe");
    }
    void harga(){
        System.out.println("Harganya RP."+350000);
    }
    void tampilkanInfo(){
        tipe();
        harga();
    }
    
}
