/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulangan;

/**
 *
 * @author user
 */
public class Siswa extends Kelas{
    public String nama, jk;
    public int na;
    public int uangsaku;
    //overriding
    public void identitassiswa(){
        System.out.println("Nama "+nama);
        System.out.println("Jenis kelamin "+jk);
        System.out.println("Nomor Absen "+na);
    }
    public void Bagiankelas(){
        System.out.println( "Sebagai "+super.bidang);
    }
    //overlaoding
    public int Ceksaku(int uangsaku){
     this.uangsaku=uangsaku;
     return uangsaku;
    }
    
    public void Ceksaku (double uangharian){
        System.out.println("uang harian "+uangharian);
    }
}
