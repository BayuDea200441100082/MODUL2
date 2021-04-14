package module2;
import java.util.Scanner;

class inputData extends VCD{
    Scanner input = new Scanner (System.in);
    int opsi;

    void data(){
        System.out.println(" ");
        System.out.println("------------------------------------------------");
        System.out.println("        MASUKKAN DATA FILM DENGAN BENAR         ");
        System.out.println("------------------------------------------------");

        VCD judul = new VCD();
        System.out.println("Judul             : ");
        judul.judul= input.nextLine();

        VCD aktor = new VCD();
        System.out.println("Aktor             : ");
        aktor.aktor= input.nextLine();

        VCD sutradara = new VCD();
        System.out.println("Sutradara         : ");
        sutradara.sutradara= input.nextLine();

        VCD publisher = new VCD();
        System.out.println("Publisher         : ");
        publisher.publisher= input.nextLine();

        VCD kategori = new VCD();
        System.out.println("Kategori    :");
        System.out.println("1. Semua umur");
        System.out.println("2. Dewasa");
        System.out.println("3. Remaja");
        System.out.println("4. Anak-anak");
        System.out.println("Masukkan Pilihan  : ");
        opsi = input.nextInt();

        switch (opsi) {
            case 1 -> kategori.kategori = "semua umur";
            case 2 -> kategori.kategori = "Dewasa";
            case 3 -> kategori.kategori = "Remaja";
            case 4 -> kategori.kategori = "Anak-anak";
        }
        VCD stok = new VCD();
        System.out.println("Stok              : ");
        stok.stok= input.nextInt();
        input.nextLine();
        System.out.println(" ");
        judul.Judul();
        aktor.Aktor();
        sutradara.sutradara();
        publisher.publisher();
        kategori.kategori();
        stok.stok();
    }
}

