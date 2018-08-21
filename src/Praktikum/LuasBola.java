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
public class LuasBola {
    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        float r,rumus;
        System.out.print("Masukkan nilai jari-jari : ");
        r = bil.nextFloat();
        rumus = 4 * 22 * r / 7 * r;
        System.out.println("Luas Permukaan bola : " + rumus);
    }
}
