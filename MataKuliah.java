public class MataKuliah {
    String kodeMK;
    String namaMK;
    int SKS;

    MataKuliah() {

    }
    
    MataKuliah(String kodeMK, String namaMK, int SKS){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.SKS = SKS;
    }
    public void tampilMatkul(){
        System.out.println("Kode MK: "+ kodeMK +" | nama: "+ namaMK +" | Sks: "+ SKS);
    }
}
//public class dataMatakuliah {
     
  //   public void tampil(){
    //     System.out.println("Daftar Matakuliah: ");
      //   for (matakuliah mk : daftarMK){
        // mk.tampil();
        // }
     //}
 //}

