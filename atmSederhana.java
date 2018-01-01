import java.util.Scanner;

/*
    
    

    Contoh Program atm sederhana dengan Java by SayapBiru
    1. variabel saldo : merupakan nominal yang dapat digunakan disini kawan kawan semua dapat menggati sesukanya
    2. untuk username dan pin : kawan-kawan bisa ganti pada if kondisional di method main

    Note : 
    Jangan Lupa dipahami Gan alur kerjanya !!!!
*/
public class atmSederhana {
    
    // silahkan edit variabel saldo, sesuka kawan kawan
    static int saldo=1000000;
    
    static Scanner input = new Scanner(System.in);
    
    
    
    
    static void menu() {
        System.out.println("+=================================+");
        System.out.println("+|            MENU ATM           |+");
        System.out.println("+=================================+");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Transfer");
        System.out.println("0. Keluar");
        
        try {
            System.out.print("Masukan Pilihan > ");
            int pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    ceksaldo();
                    break;
                case 2:
                    tariktunai();
                    break;
                case 3:
                    transfer();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default :
                   while (pilihan!=1 && pilihan!=2 && pilihan !=3 &&  pilihan !=0) {
                       System.out.print("Pilihan Salah, masukan pilihan anda kembali > ");
                       pilihan = input.nextInt();
                       if (pilihan==1) {
                           ceksaldo();
                       }
                       else if(pilihan==2) {
                           tariktunai();
                       }
                       else if(pilihan==3) {
                           transfer();
                       }
                       else if(pilihan==0) {
                           System.exit(0);
                       }
                       
                   }              
                    break;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    static void ceksaldo() {
        System.out.println("+========== CEK SALDO ==========+");
        System.out.println("Saldo Anda Rp."+saldo);
        try {
            System.out.print("Tekan 0 keluar, tekan 1 kembali ke menu > ");
            int pilihan2 = input.nextInt();
            
            switch (pilihan2) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default :
                    while (pilihan2!=1 && pilihan2!=0) {
                        System.out.print("Pilihan Salah, masukan pilihan anda kembali > ");
                        pilihan2 = input.nextInt();
                        if (pilihan2==1) {
                            menu();
                        }
                        else if(pilihan2==0){
                            System.exit(0);
                        }
                    }
                    break;
            }
                   
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void tariktunai() {
        System.out.println("+============ TARIK TUNAI =============+");
        System.out.print("Masukan Nominal Rp. > ");
        int tarikTunai = input.nextInt();
        try {
            if (tarikTunai>=saldo) {
                System.out.println("Tarik tunai melebihi saldo !!!!!");
            }
            else {
                saldo = saldo - tarikTunai;
                System.out.println("Tarik tunai berhasil !!!!!!");
                System.out.print("Tekan 0 keluar, tekan 1 kembali ke menu > ");
                int pilihan3 = input.nextInt();
                if (pilihan3==0) {
                    System.exit(0);
                }
                else if (pilihan3==1) {
                    menu();
                }
                else {
                    while(pilihan3!=1 && pilihan3!=0) {
                        System.out.print("Pilihan Salah, masukan pilihan anda kembali > ");
                        pilihan3 = input.nextInt();
                        
                        if (pilihan3==0) {
                            System.exit(0);
                        }
                        else if(pilihan3==1) {
                            menu();
                        }
                    }
                }
                
                
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    static void transfer() {
        System.out.println("+========== TRANSFER ===========+");
        System.out.print("Masukan No.Rekening > ");
        int rekening = input.nextInt();
        System.out.print("Masukan Nominal Rp. > ");
        int transfer = input.nextInt();
        try {
            if (transfer>=saldo) {
                System.out.println("Maaf Transfer melebihi Saldo");
            }
            else {
                saldo = saldo - transfer;
                System.out.println("Transfer Berhasil !!!");
                System.out.println("Ke No Rek. "+rekening);
                System.out.println("Dengan Nominal Rp."+transfer);
                System.out.print("Tekan 0 keluar, tekan 1 kembali ke menu > ");
                int pilihan4 = input.nextInt();
                if (pilihan4==0) {
                    System.exit(0);
                }
                else if(pilihan4==1) {
                    menu();
                }
                else {
                    while (pilihan4!=0 && pilihan4!=1) {
                        System.out.print("Pilihan Salah, masukan pilihan anda kembali > ");
                        pilihan4 = input.nextInt();
                        if (pilihan4==1) {
                            menu();
                        }
                        else if(pilihan4==0) {
                            System.exit(0);
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        try {
            System.out.println("+============================+");
            System.out.println("+|        PROGRAM ATM       |+");
            System.out.println("++============================");

            System.out.print("Masukan username > ");
            String username = input.nextLine();

            System.out.print("Masukan pin > ");
            int pin = input.nextInt();
            
            // silahkan ganti string "novan" dan int 153271 sesuai dengan keinginan kawan kawan.
            if ("novan".equals(username) && pin==153271) {
                menu();
            }
            else {
                System.out.println("Maaf username atau password Salah !!!!");
            }
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
