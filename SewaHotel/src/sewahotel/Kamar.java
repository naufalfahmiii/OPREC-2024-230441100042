/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewahotel;

/**
 *
 * @author THINKPAD
 */
abstract class Kamar {
    public String tipeKamar;
    public float hargakamar;
    public String namaPenyewa;
    
    abstract void tipe();
    abstract void harga();
    abstract void tampilkanInfo();
//    abstract void Reguler();
//    abstract void DoubleReguler();
//    abstract void Premium();
//    abstract void Deluxe();
//    abstract void SuperPremium();
}
