import java.util.Scanner;
public class Square22 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N  = sc.nextInt();
        
        for (int i = 1; i <= N; i++)
        {
            for (int x = 1; x <= N; x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
