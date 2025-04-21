public class MataKuliah {
    String kodeMK;
    String namaMK;
    int SKS;

    MataKuliah(String kodeMK, String namaMK, int SKS){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.SKS = SKS;
    }
    public MataKuliah(){
        
    }
    void tampilMatkul(MataKuliah[] daftarMK){
        System.out.println("\n Daftar MataKuliah: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("kode MK: " + daftarMK[i].kodeMK + " | Nama: " + daftarMK[i].namaMK + " | Sks: " + daftarMK[i].SKS);
        }
    }
}

