public class IfElse {
  public static void main(String[] args) {
    //IF ELSE BIASA
    int skor = 65 ;


    if (skor>= 90){
      System.out.println("Anda mendapatkan nilai A");
    }else if (skor >= 80){
      System.out.println("Anda mendapatkan nilai B");
    }else if (skor >= 70){
      System.out.println("Anda mendapatkan nilai C");
    }else if (skor>=60){
      System.out.println("Anda mendapatkan nilai D");
    }else {
      System.out.println("Anda mendapatkan nilai E");
    }
    System.out.println("Selesai\n\n");



    // NESTED IF ELSE -> Menempatkan if didialamnya lagi if 
    int nilai = 30;
    if (nilai>=60){
      System.out.println("Anda lulus");
      if(nilai >= 90){
        System.out.println("Nilai mu A");
      } else if (nilai>=80) {
        System.out.println("Nilai mu B");
      }else if (nilai >= 70) {
        System.out.println("Nilai mu C");
      }else if (nilai >=60){
        System.out.println("Nilai mu D");
      }else{
        System.out.println("Nilai E");
      }
    }else {
      System.out.println("Anda tidak lulus");
    }
  }
}
