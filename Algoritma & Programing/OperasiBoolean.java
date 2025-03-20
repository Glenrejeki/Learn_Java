public class OperasiBoolean {
  public static void main(String[] args) {
    System.out.println("Operator Logika :");
    boolean x = true;
    boolean y = false;
    // OPERATOR LOGIKA 
    // Operator And -> jika kedua nilainya true
    if (x && y){
      System.out.println("Kondisi Terpenuhi : ");
    } else {
      System.out.println("Kondisi tidak terpenuhi");
    }


    // Operasi OR -> True jika salah nilainya True
    if (x || y){
      System.out.println("Kondisi terpenuhi");
    } else {
      System.out.println("Kondisi tidak terpenuhi");
    }


    /**
     * .
     * True -> False
     * False -> True 
     */
     if (!x){
      System.out.println("Kondisi terpenuhi");
     }else {
      System.out.println("Kondisi tidak terpenuhi");
     }

     System.out.println("\n OPERATOR RELASIONAL :");
     // OPERATOR RELASIONAL 
     int a  = 3;
     int b = 17;

     // Operator persamaan
     if(a == b){
      System.out.println("Memenuhi");
     } else {
      System.out.println("Tidak Memenuhi");
     }

     // Operator ketidak samaan
     if(a !=b){
      System.out.println("Memenuhi");
     } else {
      System.out.println("Tidak Memenuhi");
     }

     // Operator lebih besar
     if(a > b){
      System.out.println("Memenuhi");
     } else {
      System.out.println("Tidak Memenuhi");
     }

     // Operator lebih kecil
     if(a < b){
      System.out.println("Memenuhi");
     } else {
      System.out.println("Tidak Memenuhi");
     }

  }
}
