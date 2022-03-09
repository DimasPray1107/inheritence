/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulangan;

import java.util.Scanner;

/**
 *
 * @author user
 */
class tampil {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        Siswa s = new Siswa();
        System.out.println("nama : ");
        s.nama=scan.next();
        s.jk="Laki Laki";
        s.na=5;
        
        s.identitassiswa();
        s.Bagiankelas();
        System.out.println("Uang harian "+s.Ceksaku(25000));
        System.out.println("Uang bulanan "+s.Ceksaku(720000));
    }
}
