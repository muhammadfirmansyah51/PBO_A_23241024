class mahasiswa {
    String Nama;
    String Nim;
    String Hobi;
    String jurusan;
    double IPK;
    int umur;

}

public class PBO {
    public static void main(String[] args) 
        throws Exception {
            System.out.println("Hello");

            mahasiswa mhs_1 = new mahasiswa ();
            mhs_1.Nama = "Angga Tampan";
            mhs_1.Nim = "23241024";
            mhs_1.Hobi = "badminton";
            mhs_1.jurusan = "PTI";
            mhs_1.IPK = 3.24;
            mhs_1.umur = 40;

            System.out.println("nama mahasiswa  : " + mhs_1.Nama );
            System.out.println("NIM : " + mhs_1.Nim );
            System.out.println("Hobi : " + mhs_1.Hobi );
            System.out.println("Jurusan : " + mhs_1.jurusan );
            System.out.println("IPK :" + mhs_1.IPK );
            System.out.println("umur : " + mhs_1.umur );

        }
    
}