public class BreakandContinue {
  public static void main(String[] args) {
    /**.
     * -> Mengendalikan aliran eksekusi program
     * -> Menghetikan loop atau melompati iterasi
     */

     // BREAK
     System.out.println("Break");
     for(int i=1; i<=5; i++){
      if (i == 3) {
        break; // Berhenti looping saat i ==3
      }
      System.out.println("Angka"+i);
     }

     // CONTINUE
     System.out.println("\nContinue");
     for(int i =1; i <= 5; i++){
      if (i==3) {
        continue; // Angka 3 ke skip/dilwati 
      }
      System.out.println("Angka "+i);
     }
  }
}
