import java.util.Scanner;

public class pemesananRestoran {

    
    // untuk input User
    static Scanner input = new Scanner(System.in);
    
    // untuk Makanan
    static int totalHargaMakanan;
    static int HargaFinalMakanan;
    
    
    // untuk Minuman
    static int totalHargaMinuman;
    static int HargaFinalMinuman;
    
    // Array Index harga Makanan sesuai dengan Menu Makanan
    static int[] hargaMakanan = {75000,35000,30000,40000,30000,25000,20000}; // index 0 s.d 6
    
    
    // Array Index harga Minuman sesuai dengan Menu Minuman
    static int[] hargaMinuman ={5000,5000,6000,6000,7000,7500};
    
    
    static void menu() {
        
        try {
            System.out.println("+-----------------------------------+");
            System.out.println("+|--------- MENU RESTORAN ---------|+");
            System.out.println("+-----------------------------------+");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Pesan Minuman");
            System.out.println("0. Keluar Menu");
            System.out.println("+-----------------------------------+");
            System.out.print("Masukan Pilihan > ");
            int pilihan1 = input.nextInt();
            
            switch (pilihan1) {
                case 1:
                    menuMakanan();
                    break;
                    
                case 2:
                    menuMinuman();
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                    
                default :
                    while (pilihan1!=1 && pilihan1!=2 && pilihan1!=0) {
                        System.out.print("Maaf pilihan tidak ada, harap masukan kembali pilihan anda > ");
                        pilihan1 = input.nextInt();
                        if (pilihan1==1) {
                            menuMakanan();
                        }
                        else if (pilihan1==2) {
                            menuMinuman();
                        }
                        else if (pilihan1==0) {
                            System.exit(0);
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
    
    
    static void menuMakanan() {
        System.out.println("+----------- MENU MAKANAN ------------+");
        System.out.println("1. Gurame Bakar \t Rp.75.000");
        System.out.println("2. Ayam Bakar \t \t Rp.35.000");
        System.out.println("3. Steak \t \t Rp.30.000");
        System.out.println("4. Ayam Rica \t \t Rp.40.000");
        System.out.println("5. Bandeng Presto \t Rp.30.000");
        System.out.println("6. Sate Ayam \t \t Rp.25.000");
        System.out.println("7. Sate Kambing \t Rp.20.000");
        System.out.println("+-------------------------------------+");
        System.out.print("Masukan Pilihan Menu > ");
        int pilihan2 = input.nextInt();
        pilihan2 = pilihan2-1;
        while (pilihan2>hargaMakanan.length) {
            System.out.print("Maaf pilihan tidak ada didalam Index, Masukan pilihan > ");
            pilihan2 = input.nextInt();
            if (pilihan2<=7) {
                break;
            }
        }
        System.out.print("Masukan Banyaknya menu > ");
        int pilihan3 = input.nextInt();
        
        
            totalHargaMakanan = hargaMakanan[pilihan2] * pilihan3; // belum kelar
            HargaFinalMakanan = HargaFinalMakanan+totalHargaMakanan;
            
        
        
        System.out.println("+------------------------------------+");
        System.out.println("- Tekan 1 untuk Ke MENU MAKANAN Kembali");
        System.out.println("- Tekan 2 untuk Ke MENU UTAMA");
        System.out.println("- Tekan 0 untuk Keluar dan Melihat total Pembayaran");
        System.out.println("+------------------------------------+");
        System.out.print("Masukan Pilihan Anda > ");
        int pilihan4 = input.nextInt();
        switch (pilihan4) {
            case 1 :
                menuMakanan();
                break;
                
            case 2 :
                menu();
                break;
                
            case 0 :
                report();
                break;
                
            default :
                while (pilihan4!=1 && pilihan4!=2 && pilihan4!=0) {
                    System.out.print("Maaf Pilihan yang anda masukan Salah, Masukan pilihan > ");
                    pilihan4 = input.nextInt();
                    if (pilihan4==1){
                        menuMakanan();
                    }
                    else if(pilihan4==2) {
                        menu();
                    }
                    else if(pilihan4==0) {
                        report();
                    }
                }
                break;
        }
        
    }
    
    static void menuMinuman() {
        System.out.println("+------------ MENU MINUMAN -------------+");
        System.out.println("1. ES TEH MANIS \t Rp.5000");
        System.out.println("2. ES JERUK \t \t Rp.5000");
        System.out.println("3. JUS MANGGA \t \t Rp.6000");
        System.out.println("4. JUS MELON \t \t Rp.6000");
        System.out.println("5. CAPUCINO COFFE \t Rp.7000");
        System.out.println("6. ORIGINAL COFFE \t Rp.7500");
        System.out.println("+---------------------------------------+");
        System.out.print("Masukan Pilihan Menu > ");
        int pilihan5 = input.nextInt();
        pilihan5 = pilihan5-1;
        while (pilihan5>hargaMinuman.length) {
            System.out.print("Maaf pilihan tidak ada didalam Index, Masukan pilihan > ");
            pilihan5 = input.nextInt();
            if (pilihan5<=6) {
                break;
            }
        }
        
        System.out.print("Masukan Banyaknya menu > ");
        int pilihan6 = input.nextInt();
        
        totalHargaMinuman = hargaMinuman[pilihan5]*pilihan6;
        HargaFinalMinuman = HargaFinalMinuman + totalHargaMinuman;
        
        System.out.println("+------------------------------------+");
        System.out.println("- Tekan 1 untuk Ke MENU MINUMAN Kembali");
        System.out.println("- Tekan 2 untuk Ke MENU UTAMA");
        System.out.println("- Tekan 0 untuk Keluar dan Melihat total Pembayaran");
        System.out.println("+------------------------------------+");
        System.out.print("Masukan Pilihan Anda > ");
        int pilihan7 = input.nextInt();
        
        switch (pilihan7) {
            case 1:
                menuMinuman();
                break;
                
            case 2:
                menu();
                break;
                
            case 0:
                report();
                break;
                
            default :
                while (pilihan7!=1 && pilihan7!=2 && pilihan7!=0) {
                    System.out.print("Maaf Pilihan yang anda masukan Salah, Masukan pilihan > ");
                    if (pilihan7==1) {
                        menuMinuman();
                    }
                    else if(pilihan7==2) {
                        menu();
                    }
                    else if (pilihan7==0) {
                        report();
                    }
                }
                break;
        }
        
        
    }
    
    static void report() {
        System.out.println("+---------- MENU REPORT ------------+");
        System.out.println("Total Rp."+(HargaFinalMakanan+HargaFinalMinuman));
        System.out.println("+-----------------------------------+");
    }
    
    public static void main(String[] args) {
        menu();
    }
    
}
