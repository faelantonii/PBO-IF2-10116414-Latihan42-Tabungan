/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan42_Tabungan;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan tabungan
 */
public class PBO_IF2_10116414_Tabungan {
        public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        Scanner scan = new Scanner (System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal\t: ");
        int saldo = scan.nextInt();
        
        System.out.print("Jumlah uang yang diambil: ");
        int jumlah = scan.nextInt();
        
        System.out.println("");
        System.out.println("Saldo Anda Sekarang\t: "+tabungan.TarikUang(saldo-jumlah));
        
        
    }
}
