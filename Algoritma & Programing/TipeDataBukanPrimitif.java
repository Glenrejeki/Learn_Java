public class TipeDataBukanPrimitif {
  public static void main(String[] args) {
    // Autoboxing : konversi int ke Integer
    int number = 42;
    Integer wrapeddNumber = number;

    // Unboxing konversi Integer ke int
    Integer anotherNumber = 99;
    int unwrapedNumber = anotherNumber; // kuncinya main variabel aja tapi kita buat tipe data int dulu 

    System.out.println("Autoboxing: "+wrapeddNumber);
    System.out.println("Unboxing: "+unwrapedNumber);


    // Penggunaan metode parseInt() dari integer 
    String strNumber = "123"; // mengubah string menjadi angka
    int parsedNumber = Integer.parseInt(strNumber); // parseInt kunci
    System.out.println("Hasil parsing: "+ parsedNumber);

  }
}
