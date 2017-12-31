import java.util.Scanner;

/*
    Jangan Lupa dipahami Gan !!!!
*/
public class perulanganTangga {

    public static void main(String[] args) {
        
        Scanner inputData = new Scanner(System.in);
        
        System.out.println("+======================================+");
        System.out.println("+||        Perulangan Tangga         ||+");        
        System.out.println("+======================================+");
        
        System.out.print("Masukan Jumlah Perulangan > ");
        int angka = inputData.nextInt();
        
        System.out.println("+============== OUTPUT ================+");
        
        for (int i=0;i<=angka;i++) {
            for (int x=0;x<=i;x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("+============== END ===================");

        
    }

    
}
