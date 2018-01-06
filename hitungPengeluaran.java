import java.util.Scanner;

/*
    === Program Hitung Pengeluaran ===
    > Program ini digunakan untuk menghitung pengeluaran
    yang dilakukan selama sebulan,
    1. Masukan nama Anda
    2. Masukan nominal Gaji perBulan
    3. Masukan alasan Pengeluaran
    4. Masukan Nominal Pengeluaran


/*

public class hitungPengeluaran {

    static Scanner input = new Scanner (System.in);
    static int gaji;
    static String nama;
    static int batas=50;
    static String[] judul = new String[batas];
    static int[] pengeluaran = new int[batas];
    
    
    void menu() throws Throwable {
        
        try {
            System.out.println("+------- Program Hitung Pengeluaran --------+");
            System.out.print("Masukan nama > ");
            nama = input.nextLine();
            System.out.print("Masukan gaji anda perBulan Rp. : ");
            gaji = input.nextInt();
            System.out.println("+-------- Petunjuk Penggunaan ----------+");
            System.out.println("1. Masukan Nominal Gaji anda");
            System.out.println("2. Masukan Judul Pengeluaran");
            System.out.println("3. Masukan Nominal Pengeluaran");
            System.out.println("4. Ini akan terus berulang sampai anda ingin mengakhiri dengan menekan tombol angka 0");
            System.out.print("Apakah anda ingin melanjutkan [Tekan 1 Ya / Tekan 2 Tidak] > ");
            int pilihan1 = input.nextInt();
            switch (pilihan1) {
                case 1:
                    lanjutan();
                    break;
                    
                case 2:
                    System.exit(0);
                    break;
                
                default :
                    while (pilihan1!=1 && pilihan1!=2) {
                        System.out.print("Pilihan salah harap masukan 1/Ya,Lanjutkan atau 2/Tidak Lanjutkan > ");
                        pilihan1 = input.nextInt();
                        if (pilihan1==1) {
                            lanjutan();
                        }
                        else if(pilihan1==2) {
                            System.exit(0);
                        }
                    }
                    break;
            }
        }
        catch (Throwable e) {
            System.out.print("Ups Terjadi Kesalahan : ");
            System.out.println(e.getMessage());
        }
    }
    
    void lanjutan() throws Throwable {
        try {
            System.out.println("+----- Welcome To Lanjutan Menu ------+");
//            String[] pengeluaran={" "};
//            int[] nominalPengeluaran={0};
            boolean status=true;
            int batas=100;
            int pilihan3;
            
            
            for (int i=0;i<batas;i++) {
                
                
                
                
                
                System.out.print("Masukan Alasan pengeluaran[tanpaSpasi] ke-"+i+" > ");
                judul[i]=String.valueOf(input.next());
                
                System.out.print("Masukan Nominal pengeluaran ke-"+i+" Rp. > ");
                pengeluaran[i]=input.nextInt();
                
                gaji=gaji-pengeluaran[i];
                System.out.print("1/Lanjutkan atau 0/Berhenti > ");
                pilihan3=input.nextInt();
                if(pilihan3==0) {
                    
                    report();
                    break;                    
                }
            }
            
        }
        catch (Throwable e) {
            System.out.print("Ups Terjadi Kesalahan : ");
            e.printStackTrace();
        }
    }
    
    static void report() {
        System.out.println("+------------ Report Menu --------------+");
        System.out.println("Hai "+nama+" !!!!!");
        System.out.println("+------------- Pengeluaran -------------+");
//        
        
        for (int x=0;x<judul.length;x++) {
            if (judul[x]==null) {
                break;
            }
            System.out.println(x+". Pengeluaran : "+judul[x]+" : "+"\t"+pengeluaran[x]);
        } 

        System.out.println("Gaji anda Tinggal Rp. > "+gaji);
        System.out.println("+---------------------------------------+");
    }
     
    
    public static void main(String[] args) throws Throwable {
        latihan4 baru = new latihan4();
        baru.menu();
    }
    
}
