public class Mahasiswa {
    String NIM;
    String nama;
    String prodi;

    public Mahasiswa() {
    }
    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa(Mahasiswa [] listMhs){
        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < 3; i++) {
            System.out.println("NIM: " + listMhs[i].NIM + " | Nama: " + listMhs[i].nama + " | Prodi: " + listMhs[i].prodi);
        }
    }
}