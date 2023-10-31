import java.util.Arrays;
import java.util.Scanner;

public class Numbers01 {
   public static void main(String[] args) {
    
   Scanner sc01 = new Scanner(System.in);
   int[][]  myNumbers = new int [3][];
   myNumbers[0] = new int [5];
   myNumbers[1] = new int [3];
   myNumbers[2] = new int [1];

    System.out.println(myNumbers.length);
    System.out.println(myNumbers[0].length);
    System.out.println(myNumbers[1].length);
    System.out.println(myNumbers[2].length);

    // Menambahkan kode program no.1 dengan Arrays
    for (int i = 0; i < myNumbers.length; i++){
        System.out.println(Arrays.toString(myNumbers[i]));
    }

    // Menambhakan program no.2 untuk menampilkan baris ke-
    for (int i = 0; i < myNumbers.length; i++){
        System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
    }
   } 
}
