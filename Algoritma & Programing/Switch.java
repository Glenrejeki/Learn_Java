public class Switch {
  public static void main(String[] args) {
    // Switch-> memilih dan menjalankan kode berdasakan kondisi yang diberikan
    String n = "E";

    switch (n) {
      case "A":
        System.out.println("Nilai anda lebih dari 85");
        break;
      case "B":
        System.out.println("Nilai anda lebih dari 75");
        break;
      case "C":
        System.out.println("Nilai anda lebih dari 60");
        break;
      default:
        System.out.println("Nilai anda kurang dari 60");
        break;
    }

  }
}
