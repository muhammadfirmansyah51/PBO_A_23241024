public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs_1 = new Mahasiswa("Angga Tampan", "23241024");
     
        mhs_1.cetak();
     
        // memanggil method setNama()
        mhs_1.setNama("babadae");
        // cetak setelah ubah nama 
        mhs_1.cetak();
     
        // memanggil method getNama dan getNIM
        String nama_mhs = mhs_1.getNama();
        String nim_mhs = mhs_1.getNIM();
        System.out.println("Nama : " + nama_mhs);
        System.out.println("NIM : " + nim_mhs);
     
        // memanggil method say Hi
        String pesan = mhs_1.sayHi(mhs_1.getNama());
        System.out.println(pesan);
    }
}