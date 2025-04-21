public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah matkul;
    double tugas;
    double uts;
    double uas;
    double nilaiAkhir;

    Penilaian() {

    }

    Penilaian(Mahasiswa mahasiswa, MataKuliah matkul, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
    }

    void tampilkanDataPenilaian(Penilaian[] daftarNilai, Mahasiswa[] listMhs, MataKuliah[] daftarMK) {
        System.out.println("=== Data Penilaian Mahasiswa ===");
        for (int i = 0; i < 5; i++) {
            Penilaian p = daftarNilai[i];
            System.out.println( p.mahasiswa.nama + " | " + p.matkul.namaMK + " | Nilai Akhir: " + p.nilaiAkhir);
        }
    }

    void urutkanMahasiswa() {
        System.out.println("=== Urutkan Mahasiswa Berdasarkan Nilai Akhir ===");
        // Implement sorting logic here

    }
    void cariMahasiswa(String nim, Mahasiswa[]listMhs) {
        boolean find = false;
        int posisi = 0;
        for (int j = 0; j < listMhs.length; j++) {
            if(listMhs[j].NIM.equals(nim)){
                find = true;
                posisi = j;
                break;
            }
        }
        if(find == false){
            System.out.println("Mahasiswa dengan NIM " + listMhs[posisi].NIM + " tersebut tidak ditemukan dalam daftar mahasiswa");
        }else{
            System.out.println("Mahasiswa Ditemukan: " + " NIM: " + listMhs[posisi].NIM + " | Nama: " + listMhs[posisi].nama + " | Prodi: " + listMhs[posisi].prodi);
        }
    }    
}