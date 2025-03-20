public class DoWhileLoop {
  public static void main(String[] args) {
    int count = 1;
    /**.
     * Do while -> Menjalankan satu blok kode, lalu di cek kondisinya
     */
    do{
      System.out.println("Perulangan ke "+count);
      count++;
    }while(count<=5);
    System.out.println("Selesai");
  }
}
