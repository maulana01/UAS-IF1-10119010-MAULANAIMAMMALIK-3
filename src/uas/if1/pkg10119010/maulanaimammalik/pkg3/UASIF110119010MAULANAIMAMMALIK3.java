/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119010.maulanaimammalik.pkg3;

import java.util.Scanner;

/**
 *
 * @author MIM
 * Nama       : Maulana Imam Malik
 * NIM        : 10119010
 * Kelas      : IF-1
 * Tanggal    : 20-02-2021
 * Nomor Soal : 3
 */
public class UASIF110119010MAULANAIMAMMALIK3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int umur;

        StatusDewasa user = new StatusDewasa();

        System.out.print("Masukkan Umur Anda : ");
        user.setUmur(scanner.nextInt());
        umur = user.getUmur();

        System.out.println("Status Dewasa : "+ user.statusumur(umur));
    }
    
}
