import java.util.Scanner;

public class PemesananWarungMakan {

    
    // variabel
    static int jumlah;
    static int jumlahMakan;
    static int jumlahMinum;
    
    static Scanner input = new Scanner(System.in);
    
    /*
       Harga Menu Makanan   
    */
    static int[] hargaMakan= new int[]{20000,15000,20000,17000,13000};
    
    /*
       Harga Menu Minuman
    */ 
    static int[] hargaMinuman = new int[]{5000,3000,5000,5000,5000,2000};
        
    static void menu() {
        try {
            System.out.println("+--------------------------------+");
            System.out.println("+|    Menu Utama WarungMakan    |+");
            System.out.println("+--------------------------------+");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Pesan Minuman");
            System.out.println("3. Keluar");
            System.out.println("+--------------------------------+");
            System.out.print("Masukan pilihan anda > ");
            int pilihan1 = input.nextInt();

            switch (pilihan1) {

                case 1:
                    makanan();
                    break;

                case 2:
                    minuman();
                    break;

                case 3:
                    System.exit(0);
                    break;

                default :
                    while (pilihan1!=1 && pilihan1!=2 && pilihan1!=3) {
                        System.out.print("Pilihan Anda salah, Harap masukan kembali > ");
                        pilihan1 = input.nextInt();
                        if (pilihan1==1){
                            makanan();
                        }
                        else if(pilihan1==2) {
                            minuman();
                        }
                        else if(pilihan1==3) {
                            System.exit(0);
                        }
                    }
                    break;


            }
        }
        catch (Exception e) {
            System.out.print("Ups Terjadi Kesalahan : ");
            System.out.println(e.getMessage());
        }
        
    }
    
    
    
    static void makanan() {
        
        try {
            System.out.println("+--------- Menu Makanan ----------+");
            System.out.println("0. Steak sapi \t Rp.20.000");
            System.out.println("1. Tempe Bakar \t Rp.15.000");
            System.out.println("2. Sop Iga \t Rp.20.000");
            System.out.println("3. Pecel Lele \t Rp.17.000");
            System.out.println("4. Nasi Goreng \t Rp.13.000");
            System.out.println("+---------------------------------+");
            System.out.print("Masukan No. Menu > ");
            int pilihan2 = input.nextInt();
            while (pilihan2!=0 && pilihan2!=1 && pilihan2!=2 && pilihan2!=3 && pilihan2!=4) {
                System.out.print("Maaf masukan anda salah, silahkan masukan No. Menu didaftar > ");
                pilihan2 = input.nextInt();
            }
            System.out.print("Masukan Banyaknya Menu > ");
            int pilihan3 = input.nextInt();
            jumlahMakan = hargaMakan[pilihan2] * pilihan3;
            
            System.out.print("Tekan [0/Keluar] atau [1/Menu]");
            int pilihan4 = input.nextInt();
            switch (pilihan4) {
                case 0:
                    laporan();
                    break;
                    
                case 1:
                    menu();
                    break;
                    
                default :
                    while (pilihan4!=0 && pilihan4!=1) {
                        System.out.print("Pilihan Salah, harap tekan 0 atau 1 >");
                        pilihan4 = input.nextInt();
                        if (pilihan4==1) {
                            menu();
                        }
                        else if(pilihan4==0) {
                            laporan();
                        }
                    }
                    break;
            }
            
            
        }
        catch (Exception e) {
            System.out.print("Upss terjadi kesalahan : ");
            System.out.println(e.getMessage());
        }
        
    }
    
    static void minuman() {
        try {
            System.out.println("+--------- Menu Minuman ----------+");
            System.out.println("0. Teh Manis Dingin \t Rp.5000");
            System.out.println("1. Teh Tawar Hangat \t Rp.3000");
            System.out.println("2. Jus Mangga \t \t Rp.5000");
            System.out.println("3. Extra Jos \t \t Rp.5000");
            System.out.println("4. Kuku Bima \t \t Rp.5000");
            System.out.println("5. Air Putih Dingin \t Rp.2000");            
            System.out.println("+---------------------------------+");
            System.out.print("Masukan No. Menu > ");
            int pilihan5 = input.nextInt();
            while (pilihan5!=0 && pilihan5!=1 && pilihan5!=2 && pilihan5!=3 && pilihan5!=4 && pilihan5!=5) {
                System.out.print("Maaf masukan anda salah, silahkan masukan No. Menu didaftar > ");
                pilihan5 = input.nextInt();
            }
            
            System.out.print("Masukan Banyaknya Menu > ");
            int pilihan6 = input.nextInt();
            
            jumlahMinum = hargaMinuman[pilihan5] * pilihan6;
            
            System.out.print("Tekan [0/Keluar] atau [1/Menu]");
            int pilihan7 = input.nextInt();
            
            switch (pilihan7) {
                case 0:
                    laporan();
                    break;
                    
                case 1:
                    menu();
                    break;
                    
                default :
                    while (pilihan7!=0 && pilihan7!=1) {
                        System.out.print("Pilihan Salah, harap tekan 0 atau 1 >");
                        if (pilihan7==0) {
                            laporan();
                        }
                        else if (pilihan7==1) {
                            menu();
                        }
                    }
                    break;
            }
            
            
        }
        catch (Exception e) {
            System.out.print("Ups terjadi kesalahan : ");
            System.out.println(e.getMessage());
        }
    }
    
    static void laporan() {
        jumlah = jumlahMakan+jumlahMinum;
        System.out.println("+-------------- Laporan ---------------+");
        System.out.println("Jumlah Tagihan > Rp."+jumlah);
        System.out.println("+--------------------------------------+");
    }
    
    
    public static void main(String[] args) {
        
        menu();
        
    }
    
}
