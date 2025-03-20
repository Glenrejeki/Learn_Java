package studikasus;

import java.util.Scanner;

public class kalkulator {
  public static int  tambah(int a, int b) {
    return a + b;
  }

  public static int kurang (int a, int b){
    return a - b;
  }

  public static int kali (int a, int b){
    return a * b;
  }

  public static double bagi (int a, int b){
    if (b == 0 ) {
      System.out.println("Error: pembagian 0 tidak bisa dizinkan");
      return 0;
    };
    return (double) a/b;
  }

  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Masukkan bilangan pertama: ");
    int angkapertama = input.nextInt();

    System.out.println("Masukkan bilangan kedua: ");
    int angkadua = input.nextInt();

    System.out.println("Hasil Penjumlahan: "+tambah());

  }
}
