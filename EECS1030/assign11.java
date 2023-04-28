package EECS1030;
import java.util.Scanner;

public class assign11 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int[] chapters = new int[15];
        for (int i = 0; i < 15; i++) {
            chapters[i] = scanner.nextInt();
        }

        boolean hasSelection = false;
        for (int i = 0; i < 15; ) {
            if (chapters[i] == 1) {
                hasSelection = true;

                int j = i + 1;
                while (j < 15 && chapters[j] == 1) {
                    j++;
                }
                j--;

                if (j - i >= 2) {
                    System.out.print((i + 1) + "-" + (j + 1) + " ");
                    i = j + 1;
                } else {
                    System.out.print((i + 1) + " ");
                    i++;
                }
            } else {
                i++;
            }
        }

        if (!hasSelection) {
            System.out.print("None ");
        }
        System.out.println();
   }
}