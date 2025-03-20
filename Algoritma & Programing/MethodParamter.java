public class MethodParamter {
  // Method tanpa paramter 
  public static void hai(){
    System.out.println("Hi");
  }

  public static void penjumlahan(int angka){
    System.out.println(2 * angka *angka);
  }

  public static void sapa(String nama){
    System.out.println("Hi ! nama saya, "+ nama);
  }

  public static void main(String[] args) {
    penjumlahan(3);

    sapa("Glen");
    sapa("Nicolas");
  }

  


}
