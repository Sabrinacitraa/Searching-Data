/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pakfirdaus;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Searching_Data {
    public static void main(String[] args) {
        int jmlhDt, i, a, cari, pencarian;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data yang akan dimasukkan : ");
        jmlhDt = scan.nextInt();
        
        int array[] = new int [jmlhDt];
        System.out.print("\nMasukkan " + jmlhDt + " buah data integer");
        System.out.println("");
        System.out.println("===========================================");
        
        //input data ke dalam array
        for ( i = 0; i < jmlhDt; i++) {
            System.out.print("data ke- " + (i + 1) + " = ");
            array[i] = scan.nextInt();
            
        }
        
        //menampilkan data sebelum diurutkan
        System.out.println("\nData di dalam array");
        System.out.println("===========================================");
        for ( a = 0; a < array.length; a++) {
            System.out.print( array[a] + ",");
            
        }
        System.out.println("");
        System.out.println("===========================================");
        
        System.out.print("Masukkan angka yang mau dicari : ");
        cari = scan.nextInt();
        
        //pemanggilan fungsi pencarian
        int result = pencarian(array, cari);
        if (result == -1){
            System.out.println("Data tidak ditemukan!");
            
    }
        else{
            System.out.println("Data ditemukan di index ke- " + result);
        }
    }
        
        //fungsi untuk pencarian data dengan inputan (parameter)
        //berupa data array dan nilai yang mau dicari
        public static int pencarian(int data[], int x){
            //menghitung jumlah index array untuk looping
            int n = data.length;
            
            //traverse array arr[]
            for (int i = 0; i < n; i++) {
                //jika data ditemukan akan me-return lokasi indexnya
                if(data[i] == x)
                    return i;
                
            }
            return -1;
        }    
}
   
    

