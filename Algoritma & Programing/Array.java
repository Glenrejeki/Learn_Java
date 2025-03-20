import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    // array satu dimensi: kumpulan nilai dengan tipe data yang sama dalam satu urutan
   int []  angkaArray;
   int angkaArray2 [];

   int [] angkaArray3 = new int[5];

   angkaArray3[0] = 10;
   angkaArray3[1] = 20;
   angkaArray3[2] = 30;
   angkaArray3[3] = 40;
   angkaArray3[4] = 50;

   String [] arrayString = {"Glen", "John", "Nico", "Chandra", "Aldo"};

   System.out.println(angkaArray3[0]);
   System.out.println(angkaArray3[1]);
   System.out.println(angkaArray3[3]);
   System.out.println(angkaArray3[4]);
   System.out.println("Nilai semua angkaArray: "+Arrays.toString(angkaArray3)); //  Arrays.toString : menampilkan semua  isi array 

   System.out.println("Panjang array angkaArray: " +angkaArray3.length); // mencari panjang array 

   System.out.println(arrayString[0]);
   System.out.println("Isi semua arrayString: " + Arrays.toString(arrayString));
  System.out.println("Panjang arrayString: "+arrayString.length);


  //ARRAY MULTIDIMENSI : array yang berisi di dalamnya 
    int [] [] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    System.out.println("Matrix[2][1]: "+matrix[2][1]);
  }
}
