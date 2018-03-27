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
public class Karpet {
    double panjang;
    double lebar;

    public Karpet() {
        panjang =12;
        lebar =4;
    }

    public Karpet(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void cetakKarpet(){
        System.out.println("===========================");
        System.out.println("panjang karpet = "+panjang);
        System.out.println("lebar karpet = "+lebar);
        System.out.println("===========================");
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    void cetakLuas(){
        System.out.println("Luasnya adalah = "+hitungLuas());
    }
}
