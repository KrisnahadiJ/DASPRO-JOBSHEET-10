public class Bioskop11Modif {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.println( penonton.length);
        System.out.println( penonton[0].length);
        System.out.println( penonton[1].length);
        System.out.println( penonton[2].length);
        System.out.println( penonton[3].length);
        

        System.out.println("Penonton pada baris ke-3:");
        
        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Penonton pada baris ke-" + (i+1) + ": ");
            for (String penontonNama : penonton[i]) {
                System.out.print(penontonNama + " ");
            }
            System.out.println();
        }
    }
}