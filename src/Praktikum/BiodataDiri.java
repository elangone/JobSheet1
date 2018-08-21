/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Taka
 */
public class BiodataDiri {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama,tl,tanggal,kelamin,alamat,motto;
        int nis;
        
        System.out.print("Masukkan Nama : ");
        nama = masukan.next();
        System.out.print("Masukkan NIS : ");
        nis = masukan.nextInt();
        System.out.print("Masukkan Tempat Lahir : ");
        tl = masukan.next();
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggal = masukan.next();
        System.out.print("Masukkan Jenis Kelamin : ");
        kelamin = masukan.next();
        System.out.print("Masukkan Alamat di Malang : ");
        alamat = masukan.next();
        System.out.print("Masukkan Motto Hidup : ");
        motto = masukan.next();
        
        System.out.println();
        System.out.println("=================================================");
        System.out.println("Biodata Diri");
        System.out.println("Nama             : " + nama);
        System.out.println("NIS              : " + nis);
        System.out.println("Tempat lahir     : " + tl);
        System.out.println("Tanggal lahir    : " + tanggal);
        System.out.println("Jenis Kelamin    : " + kelamin);
        System.out.println("Alamat di Malang : " + alamat);
        System.out.println("Motto Hidup      : " + motto);
    }
}
