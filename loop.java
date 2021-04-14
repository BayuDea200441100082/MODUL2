package module2;

import  java.util.Scanner;

class looping {

    public static void main(String[] args) {
        inputData  data = new inputData();
        Scanner input = new Scanner(System.in);

        int pilih = 1;
        while (pilih == 1) {
            data.data();
            System.out.println("----------------------------------");
            System.out.println("Ulangi entry data ?");
            System.out.println("1. Mengulangi");
            System.out.println("2. Selesai");
            System.out.print("Masukkan pilihan : ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih != 1) {
                pilih = 2;
                System.out.println("----------------------------------");
            }
        }
    }
}