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
        System.out.println("\nData Penilaian : ");
        for (int i = 0; i < 5; i++) {
            Penilaian p = daftarNilai[i];
            System.out.println( p.mahasiswa.nama + " | " + p.matkul.namaMK + " | Nilai Akhir: " + p.nilaiAkhir);
        }
        System.out.println();
    }

    void urutkanMahasiswa(Penilaian[] daftarNilai, Mahasiswa[] listMhs, MataKuliah[] daftarMK) {
        System.out.println("\nData Penilaian : ");
        for (int i = 0; i < daftarNilai.length-1; i++) {
            for (int j = i + 1; j < daftarNilai.length; j++){
                if (daftarNilai[i].nilaiAkhir < daftarNilai[j].nilaiAkhir){
                    Penilaian temp = daftarNilai[i];
                    daftarNilai[i] = daftarNilai[j];
                    daftarNilai[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            Penilaian p = daftarNilai[i];
            System.out.println(p.mahasiswa.nama +" | "+p.matkul.namaMK+" | Nilai Akhir: "+p.nilaiAkhir);
        }
        System.out.println();

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
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam daftar mahasiswa");
            System.out.println();
        }else{
            System.out.println("Mahasiswa Ditemukan: " + " NIM: " + nim + " | Nama: " + listMhs[posisi].nama + " | Prodi: " + listMhs[posisi].prodi);
            System.out.println();
        }
    }    
}