/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author oktaviana larasati
 */
public class BilanganKompleks2 {
    private static Object bil;
    public static void main(String[]args){
        System.out.println("Masukkan: ");
        Scanner in = new Scanner(System.in);
        String a1 = in.nextLine();
        String a2 = in.nextLine();
        String real1, real2, img1, img2;
        System.out.println("Hasil: ");
        
        //kemungkinan ke1
        if(a1.length()==4){
            String[] bagian1 = a1.split("\\+");
            String[] bagian2 = a2.split("\\+");
            
            //bilangan pertama
            real1 = bagian1[0];
            String imajiner1 = bagian1[1];
            img1 = bagian1[1].substring(0,1);
            
            //bilangan ke-2
            real2 = bagian2[0];
            String imajiner2 = bagian2[1];
            img2= bagian2[1].substring(0,1);
            
            //string to int
            int R1 = Integer.parseInt(real1);
            int R2 = Integer.parseInt(real2);
            int I1 = Integer.parseInt(img1);
            int I2 = Integer.parseInt(img2);
            print (R1,R2,I1,I2);
            
        }
        else if (a1.length()==2){
            String[] bagian2 = a2.split("\\-");
            
            // bil real petama = 0
            real1="0";
            img1 = a1.substring(0,1);
            real2 = bagian2[0];
            String imajiner2 = bagian2[1];
            img2 = bagian2[1].substring(0,1);
            
            int R1 = Integer.parseInt(real1);
            int R2 = Integer.parseInt(real2);
            int I1 = Integer.parseInt(img1);
            int I2 = Integer.parseInt(img2);
            print (R1, R2, I1, (I2*(-1)));
            
            
        }
    }
    //hasil perhitungan
    public static void print(int R1, int R2,int I1, int I2 ){
        System.out.println(((R1*R2)-(I1*I2))+"+"+((R1*I2)+(R2*I1))+"i");
    }


}
