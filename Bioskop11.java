public class Bioskop11 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.print(penonton[i][j] + "\t");
            }
            System.out.println();
        }
    }
}