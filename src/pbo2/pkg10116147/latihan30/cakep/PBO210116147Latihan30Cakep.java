package pbo2.pkg10116147.latihan30.cakep;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk mengubah kata tertentu pada kalimat.
 */

import java.util.Scanner;

public class PBO210116147Latihan30Cakep {
    
    static Scanner scan = new Scanner(System.in);
    
    String warna, nama;
    
    String merah = "\u001b[31m";
    String biru = "\u001b[34m";
    String kuning = "\u001b[33m";
    String hijau = "\u001b[32m";
    String ungu = "\u001b[35m";
    String biruMuda = "\u001b[36m";
    
    public void pertanyaan(){
        System.out.println(merah + "Kamu" + hijau + " ngerjain sendiri " + kuning +
                "latihan 17 sampe" + biru + " latihan 30 ini?");
    }
    
    public String jawabanSaya(){
        System.out.print(biru + "Jawab" + merah + " (ya/tidak) : ");
        String jawaban = scan.next().toLowerCase();
        System.out.println();
        return jawaban;
    }
    
    public void isiKomentar(){
        if(jawabanSaya().equals("ya")){
           System.out.println(merah + "Cakep bener," + ungu +" good job!"); 
        }else{
            System.out.println(merah + "Tetep cakep sih.");
            System.out.println(biruMuda + "Yang penting paham konsepnya ya.");
            System.out.println("Keep the code works!");
        }
    }
    
    public static void main(String[] args) {
        PBO210116147Latihan30Cakep jawab = new PBO210116147Latihan30Cakep();
        jawab.pertanyaan();
        jawab.isiKomentar();
        System.out.println("\nDeveloped by Garry Prang");
    }
    
}
