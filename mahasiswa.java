package k01.pbo.ti20192020.pkg3.pkg4;
public class mahasiswa {
    //property yang dimiliki mahasiswa
    public String alamat; //public= bisa diakses dimana saja
    public String nama;
    public String nim;
     
    //method untuk menampilkan biodata mahasiswa sesuai dengan property
    public void tampilBiodata(){
        System.out.println("Biodata Mahasiswa:");
        System.out.println("Alamat :" + alamat);
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
    }
}
