import java.util.Scanner;

public class NestedLoop_2341720180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temps [][] = new double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        int i = 0;
        for (double [] kotaTemps : temps) {
            System.out.print("Kota ke-"+ (i+1) + ": ");
            double rata2 = 0;
            for (double temp : kotaTemps) {
                System.out.println(temp + " ");
                rata2 += temp;
            }
            rata2 /= kotaTemps.length;
            System.out.println("Rata - rata: " + rata2);
            System.out.println();
            i++;
        }
    }
}
