import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata siswa ke-" + (i + 1) + ": " + totalPerSiswa / nilai[i].length);
        }

        System.out.println("Rata-rata nilai setiap mata kuliah:");
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMataKuliah = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMataKuliah += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMataKuliah / nilai.length);
        }
    }
}
