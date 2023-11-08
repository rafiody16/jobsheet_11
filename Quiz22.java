import java.util.Scanner;
import java.util.Random;
public class Quiz22 {
    public static void main (String [] args)
    {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka(1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (!success) {
                    if (number > answer) {
                        System.out.println("Number > Answer");
                    } else if (number < answer) {
                        System.out.println("Number < Answer");
                    }
                }
            } while (!success);
            System.out.println("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
