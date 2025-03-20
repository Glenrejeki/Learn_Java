public class Method {
  /**.
   * Method -> Blok kode yang dipanggil untuk melakukan tugas tertentu
   * 
   * modifier returnType namaMethod (paramter){
   * //Blok kode method
   * }
   * 
   * 
   * 1. Modifier -> mengatur akseblitas dan sifat suatu kelas, variabel, atau method 
   * 2. Return type -> menentukan jenis data yang akan dikembalikan method setelah diekskusi (publik, privat, protect, default, static). Jika method tidak melakukan gunakan "void"
   * 3. Nama method -> nama unik untuk mengidentifikasi method 
   * 4. Parameter -> data yang diterima oleh method (opsional)
   */


   public static String sapa(String nama){
    return "Halo "+nama+" ! Selamat datang di Indomaret";
   }


  public static void main(String[] args) {
    String nama = "Glen";
    String sapaLokal = sapa(nama); // untuk memanggil method sapa kita buat variabel lokal di main dimana variabel itu bernamaan sapaLokal
    System.out.println(sapaLokal);
  }
}
