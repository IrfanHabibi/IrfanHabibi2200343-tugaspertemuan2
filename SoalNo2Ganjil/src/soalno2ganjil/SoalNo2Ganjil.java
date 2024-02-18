/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalno2ganjil;

import java.util.Scanner;

public class SoalNo2Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang Anda: ");
        int jumlahUang = input.nextInt();

        System.out.print("Apakah sedang hujan? (true/false): ");
        boolean sedangHujan = input.nextBoolean();

        if (jumlahUang > 5000 && !sedangHujan) {
            System.out.println("Anda bisa membeli gorengan.");
        } else {
            System.out.println("Anda tidak bisa membeli gorengan.");
        }

        input.close();
    }
}

