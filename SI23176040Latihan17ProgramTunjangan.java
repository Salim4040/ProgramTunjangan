/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176040.latihan17.programtunjangan;

/**
 *
 * @author BISMILLAH
 * NAMA     : Salim Reza
 * KELAS    : Sistem Informasi
 * NIM      : 23176040
 * Deskripsi Program : Program ini berfungsi untuk menghitung total gaji bulanan berdasarkan gaji pokok 
 * dan status menikah. Jika pengguna menikah, akan dihitung tunjangan sebesar 35% dari gaji pokok
 */
import java.util.Scanner;

public class SI23176040Latihan17ProgramTunjangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scanner.next();

        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\n=========Hasil Perhitungan Gaji Anda==========");
        System.out.printf("Gaji Pokok   : Rp %.1f%n", gajiPokok);
        System.out.printf("Tunjangan    : Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji   : Rp %.1f%n", totalGaji);
    }
    
}

