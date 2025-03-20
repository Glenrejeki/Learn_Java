public class ForEachLoop {
  public static void main(String[] args) {
    /**.
     * For Each Loop -> Mengulangi elemen array
     * for (tipe data elemen : variabel array){
     * Blok kode yang akan dijalankan
     * }
     */

     int [] angkaArrray = {1,2,3,4,5};
     String [] namaKu = {"G","L","E","N"};
 
     for(int angka : angkaArrray){
      System.out.println("Angka: "+angka);
     }
     for(String nama : namaKu){
      System.out.println("Nama ku adalah "+nama);
     }


  }
}
