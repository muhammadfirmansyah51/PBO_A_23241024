public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void cetak() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public String sayHi(String nama) {
        return "Hi, " + nama + "!";
    }
}