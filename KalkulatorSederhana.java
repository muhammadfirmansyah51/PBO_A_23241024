import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih Operasi:");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");

        
        int Operasi = input.nextInt();

        System.out.print("Masukan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukan angka kedua: ");
        double angka2 = input.nextDouble();


        double hasil = 0;
        switch (Operasi) {
            case 1:
                hasil = angka1 + angka2;

        System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;

        System.out.println("Hasil pengurangan: " + hasil);
                break;
            case 3 : 
                hasil = angka1 * angka2;

        System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4 :
            if (angka2 != 0) {
                hasil = angka1 / angka2;

        System.out.println("Hasil pembagian: " + hasil);

            } else {

        System.out.println("Error: tidak bisa membagi dari nol.");
            }
            default:
                break;
        }

    }
}