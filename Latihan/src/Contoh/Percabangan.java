/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh;
import java.util.*;
/**
 *
 * @author AfdalMaulana
 */
public class Percabangan {
    public static void main(String[] args) {
        String nama, pend;
        int gol, jamker,ht=300000;
        double tunjP = 0, tunjJ,lmbr,total;
        Scanner input = new Scanner(System.in);
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. DINGIN DAMAI");
        System.out.print("Nama Karyawan :");
        nama = input.nextLine();
        System.out.print("Pendidikan [SMU|D3|S1] :");
        pend = input.nextLine();
        System.out.print("Golongan [1|2|3] :");
        gol = input.nextInt();
        System.out.print("Jumlah Jam Kerja :");
        jamker = input.nextInt();
        switch (gol) {
            case 1: tunjJ = (ht * 5) / 100;
            if ("SMU".equals(pend)) {
                tunjP = (ht * 2.5) / 100;
            } else if ("D3".equals(pend)) {
                tunjP = (ht * 5) / 100;
            } else if ("S1".equals(pend)) {
                tunjP = (300000 * 7.5) / 100;
            } else {
                tunjP = 0;
            }
        break;
            case 2:
                tunjJ = (ht * 10) / 100;
                if ("SMU".equals(pend)) {
                    tunjP = (ht * 2.5) / 100;
                } else if ("D3".equals(pend)) {
                    tunjP = (ht * 5) / 100;
                } else if ("S1".equals(pend)) {
                    tunjP = (ht * 7.5) / 100;
                } else {
                    tunjP = 0;
                }
        break;
            case 3:
                tunjJ = (ht * 15) / 100;
                if ("SMU".equals(pend)) {
                    tunjP = (ht * 2.5) / 100;
                } else if ("D3".equals(pend)) {
                    tunjP = (ht * 5) / 100;
                } else if ("S1".equals(pend)) {
                    tunjP = (ht * 7.5) / 100;
                } else {
                    tunjP = 0;
                }
        break;
            default:
                tunjJ = 0;
        }
        if(jamker>8){
            lmbr=(jamker-8)*2500;
        }else{
            lmbr=0;
        }
        System.out.println("Karyawan Yang Bernama :" + nama);
        System.out.println("Honor Yang Diterima");
        System.out.println("Honor Tetap Rp. " + ht);
        System.out.println("Tunjangan Jabatan Rp. " + tunjJ);
        System.out.println("Tunjangan Pendidikan Rp. " + tunjP);
        System.out.println("Honor Lembur Rp. " + lmbr);
        System.out.println("--------------------------------------");
        total=ht+tunjJ+tunjP+lmbr;
        System.out.println("Honor Yang Diterima Rp. " + total);

        }
}