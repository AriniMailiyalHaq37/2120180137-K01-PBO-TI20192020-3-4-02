package k01.pbo.ti20192020.pkg3.pkg4;
public class SK03_PBO_TI20192020_3_4_01 {
    public static void main(String[] args) {
        //instansiasi dari class mahasiswa
     mahasiswa mahasiswa_1= new mahasiswa(); //mahasiswa_1 sebagai object baru
     mahasiswa_1.alamat= "Sukorejo Bojonegoro"; //memasukkan data yang dibutuhkan (alamat) mahasiswa
     mahasiswa_1.nama= "Arini Mailiyal Haq"; //memasukkan data yang dibutuhkan (nama) mahasiswa
     mahasiswa_1.nim= "2120180137"; //memasukkan data yag dibutuhkan (NIM) mahasiswa
     mahasiswa_1.tampilBiodata(); //memanggil method biodata pada kelas mahasiswa
     
     //diulang seperti diatas denga object yang berbeda
     mahasiswa mahasiswa_2= new mahasiswa();
     mahasiswa_2.alamat= "Senori Tuban";
     mahasiswa_2.nama= "Hidayatul Ummah";
     mahasiswa_2.nim= "2120180156";
     mahasiswa_2.tampilBiodata();
     
     mahasiswa mahasiswa_3= new mahasiswa();
     mahasiswa_3.alamat= "Trucuk Bojonegoro";
     mahasiswa_3.nama= "Diah Anggraini";
     mahasiswa_3.nim= "2120180144";
     mahasiswa_3.tampilBiodata();
     
     mahasiswa mahasiswa_4= new mahasiswa();
     mahasiswa_4.alamat= "Parengan Tuban";
     mahasiswa_4.nama= "Erlin Subianti";
     mahasiswa_4.nim= "2120180148";
     mahasiswa_4.tampilBiodata();
     
     mahasiswa mahasiswa_5= new mahasiswa();
     mahasiswa_5.alamat= "Sukorejo Bojonegoro";
     mahasiswa_5.nama= "Erlinda Nova Prastianti";
     mahasiswa_5.nim= "2120180149";
     mahasiswa_5.tampilBiodata();
    }
    
}
