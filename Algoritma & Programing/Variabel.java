public class Variabel {
  public static void main(String[] args) {
    // insialisasi variabel 
    String nama; 
    byte umur ;
    double tinggiBadan;
    int tahun;

    nama = "maulana";
    umur = 19;
    tinggiBadan = 165.5;
    tahun = 2024;

    System.out.println("Nama" + nama);
    System.out.println("Umur : " + umur);
    System.out.println("Tinggi badan : " + tinggiBadan);
    System.out.println("Tahun : " + tahun);


    // double pi = 3.14; gk bisa lagi karena udah ada kata kunci final double, gk bisa lagi sama variabelnya dan datanya gk bisa dirubah
    final double pi = 22.7; // kenapa ini bermasalah 
    System.out.println("Nilai pi :" + pi);

  }
}
