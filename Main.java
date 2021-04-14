package module2;

class VCD {
    String judul,aktor,sutradara,publisher,kategori;
    int stok;

    void Judul (){
        System.out.println(" ");
        System.out.println("================================================");
        System.out.println("               FILM YANG TERINPUT               ");
        System.out.println("================================================");
        System.out.println("Judul Film      : "+this.judul);
    }
    void Aktor () {

        System.out.println("Aktor           : "+this.aktor);
    }
    void sutradara () {

        System.out.println("Sutradara       : "+this.sutradara);
    }
    void publisher() {
        System.out.println("Publisher       : "+this.publisher);
    }
    void kategori () {
        System.out.println("Kategori        : "+this.kategori);
    }
    void stok () {
        System.out.println("Stok            : "+this.stok);
    }
}