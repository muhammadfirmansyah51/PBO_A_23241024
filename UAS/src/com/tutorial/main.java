package com.tutorial;

public class main {
    public static void main(String[] args) {
        member pelanggan1 = new member("orang1");
        nonMember pelanggan2 = new nonMember("orang2");

        double totalBelanja1 = 600_000;
        double totalBelanja2 = 120_000;

        System.out.println("Pelanggan: " + pelanggan1.getNama());
        pelanggan1.member();
        System.out.println("Total Belanja: " + totalBelanja1);
        System.out.println("Diskon: " + pelanggan1.hitungDiskon(totalBelanja1));
        System.out.println("Total Setelah Diskon: " + (totalBelanja1 - pelanggan1.hitungDiskon(totalBelanja1)));

        System.out.println();

        System.out.println("Pelanggan: " + pelanggan2.getNama());
        pelanggan2.nonMember();
        System.out.println("Total Belanja: " + totalBelanja2);
        System.out.println("Diskon: " + pelanggan2.hitungDiskon(totalBelanja2));
        System.out.println("Total Setelah Diskon: " + (totalBelanja2 - pelanggan2.hitungDiskon(totalBelanja2)));
    }
}
