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
    public void tampilMatkul(MataKuliah [] daftarMK){
        System.out.println("=== Daftar Mata Kuliah ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Kode MK: " + daftarMK[i].kodeMK + " | Nama: " + daftarMK[i].namaMK + " | SKS: " + daftarMK[i].SKS);
        }
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

