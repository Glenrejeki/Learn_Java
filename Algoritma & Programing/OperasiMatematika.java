public class OperasiMatematika {
  public static void main(String[] args) {
    int penjumlahan, pengurangan, perkalian, modulo;
    double pembagian;

    penjumlahan = 2 + 3 ;
    pengurangan = 3-5;
    perkalian = 2 * 6 ;
    pembagian = 4/3;
    modulo = 6 % 2; // sisa bagi
    // pembagian2 = 1/0;

    System.out.println(penjumlahan);
    System.out.println(pengurangan);
    System.out.println(perkalian);
    System.out.println(modulo);
    System.out.println(pembagian);


    // CONTOH PEMAKAIAN FORMULA
    int a = 8 ;
    int b = 2 ;
    int formula = a * a - (a+b)/2;
    System.out.println("Hasil perhitungan a * a - (a+b)/2: "+formula);

    //AUGMENTED ASSIGMENT -> cara singkat untuk menulis operasi pada variabel yang sama
    int c = 20 ;


    c+= 10;
    System.out.println(c);
    c-= 10 ;
    System.out.println(c);
    c*=10;
    System.out.println(c);
    c/= 10;
    System.out.println(c);
    c%= 10;
    System.out.println(c);


    // UNARY OPERATOR
    int d = 100 ; 

    System.out.println("Angka mulanya untuk int d: "+d);

    d++;
    System.out.println( "Increment: "+ d);

    d++;
    System.out.println( "Increment kedua: "+ d);


    d--;
    System.out.println( "Decrement: " + d);


    //AKAR, PANGKAT, & SINUS
    double angka = 25;
    
    // Math.sqrt(angka)
    double akarKuadrat = Math.sqrt(angka);
    System.out.println("Akar kudarat dari "+ angka +"adalah "+akarKuadrat);

    // Math.pow(angka)
    double hasilPangkat = Math.pow(angka,2);
    System.out.println("Pangkat dua dari "+angka+"adalah "+hasilPangkat);
  }
}
