/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalno3ganjil;

import java.util.Scanner;

public class SoalNo3Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan karakter pertama: ");
        char pertama = input.next().charAt(0);

        System.out.print("Masukkan karakter kedua: ");
        char kedua = input.next().charAt(0);

        int asciiPertama = (int) pertama;
        int asciiKedua = (int) kedua;
        int totalAscii = asciiPertama + asciiKedua;

        System.out.println("Total ASCII dari " + pertama + " dan " + kedua + " adalah: " + totalAscii);
    }
}

