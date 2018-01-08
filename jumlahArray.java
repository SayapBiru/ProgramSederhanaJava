import java.util.Scanner;

public class jumlahArray {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("+----------------------------------------------+");
        System.out.println("+|-------- Program Penjumlahan Array ---------|+");
        System.out.println("+----------------------------------------------+");
        System.out.println("- Ingat Array dimulai dari Index 0 bukan 1");
        System.out.println("- Jika anda memasukan index 9 itu berarti index array dari 0 s.d 8");
        System.out.println("+----------------------------------------------+");
        System.out.print("Masukan Index Array > ");
        int index = input.nextInt();
        int [] angka = new int[index];
        int hasil=0;
        
        for (int i=0;i<angka.length;i++) {
            System.out.print("Masukan Elemen Array ke-"+i+" > ");
            angka[i]=input.nextInt();
            System.out.println("+------------------------------+");
        }
        
        for (int x=0;x<angka.length;x++){
            
            hasil = hasil+angka[x];
            System.out.println("Element Array ke-"+x+" = "+angka[x]);
        }
        System.out.println("+-------------------------------+");
        System.out.println("Hasil Penjumlahan Array adalah > "+hasil);
        System.out.println("+---------- SELESAI ------------+");
        
        
    }
    
}
