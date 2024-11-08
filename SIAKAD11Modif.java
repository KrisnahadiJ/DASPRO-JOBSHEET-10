import java.util.Scanner;

public class SIAKAD11Modif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < jumlahMataKuliah; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata siswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMataKuliah);
        }

        System.out.println("Rata-rata nilai setiap mata kuliah:");
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMataKuliah = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMataKuliah += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMataKuliah / jumlahSiswa);
        }
    }
}
