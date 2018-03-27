/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02;

/**
 *
 * @author ASUS
 */
public class KarpetAksi {
    public static void main(String[] args) {
        Karpet k1 = new Karpet();
        k1.panjang = 10;
        k1.lebar = 2;
        
        k1.cetakKarpet();
        System.out.println("Luas Karpet = "+k1.hitungLuas());
        k1.cetakLuas();
        
        Karpet k2 =new Karpet();
        k2.cetakKarpet();
        
        Karpet k3 = new Karpet(25,2);
        k3.cetakKarpet();
    }
}
