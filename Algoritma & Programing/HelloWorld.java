public class HelloWorld {

  public static void main(String[] args) {
   System.out.println("Halo dunia 1"); // mengeksekusi dalamnya dan membuat baris baru
   System.out.print("Halo Dunia 2"); // bakal nyatu ke baris selaj
   System.out.printf("Halo Dunia 3");
   System.out.println();
   System.out.printf("%s %s", "Nama Saya ", "Glen Sitorus"); // walaupun terpisah tanda petiknya masih bisa nyambung kalau pakai printf, dimana disini bermain format string
   System.out.println("/n");
   System.out.printf(" %s", "Nama Saya ", "Glen Sitorus"); // walaupun terpisah tanda petiknya masih bisa nyambung kalau pakai printf, dimana disini bermain format string, contohya saya hapus satu string saja, maka akan menampilkan satu string saja
  }
}