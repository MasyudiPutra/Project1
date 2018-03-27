/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author ASUS
 */
public class KarpetAksi {
    public static void main(String[] args) {
        Karpet k1 = new Karpet();
        
        k1.merek = "Orchid";
        k1.bahan = "Karet";
        k1.harga = 15000;
        k1.made = "Korea";
        k1.kualitas = "Baik";
        
        k1.infoKarpet();
    }
    
}
