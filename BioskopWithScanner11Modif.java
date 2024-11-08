import  java.util.Scanner;

public class ModifBioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1: Input data penonton");
            System.out.println("2: Tampilkan daftar penonton");
            System.out.println("3: Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();

                int baris;
                int kolom;
                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            break;
                        } else {
                            System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println("Nomor baris atau kolom tidak tersedia.");
                    }
                }
            } else if (menu == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print(penonton[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}
