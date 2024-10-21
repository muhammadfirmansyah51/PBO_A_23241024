class MOTOR{
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    public MOTOR (String merk,int tahun,String noPolisi,String warna){
        this.merk = merk;
        this.tahun = tahun;
        this.noPolisi = noPolisi;
        this.warna = warna;
    }

    void showInfoMotor(){
        System.out.println("merk :" + this.merk);
        System.out.println("tahun :" + this.tahun);
        System.out.println("nomer polisi:" + this.noPolisi);
        System.out.println("warna  :" + this.warna);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        MOTOR mtr1 = new MOTOR("honda",1999,"GT 007","biru");
        mtr1.showInfoMotor();

        
    }
}
