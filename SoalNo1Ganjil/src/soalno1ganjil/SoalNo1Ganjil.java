/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalno1ganjil;

import java.util.Scanner;

public class SoalNo1Ganjil {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Input bilangan pertama: ");
        int bilanganPertama = masukan.nextInt();
        System.out.print("Input bilangan kedua: ");
        int bilanganKedua = masukan.nextInt();
        System.out.print("Input bilangan ketiga: ");
        int bilanganKetiga = masukan.nextInt();

        int penjumlahan = bilanganPertama + bilanganKedua + bilanganKetiga;
        int pengurangan = bilanganPertama - bilanganKedua - bilanganKetiga;
        int perkalian = bilanganPertama * bilanganKedua * bilanganKetiga;
        double pembagian = (double) bilanganPertama / bilanganKedua / bilanganKetiga;

        System.out.println("Hasil penjumlahan: " + penjumlahan);
        System.out.println("Hasil pengurangan: " + pengurangan);
        System.out.println("Hasil perkalian: " + perkalian);
        System.out.println("Hasil pembagian: " + pembagian);

        masukan.close();
    }
}
