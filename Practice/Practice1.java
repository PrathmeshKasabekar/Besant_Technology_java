package Practice;
import java.util.*;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Words for digits
        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        System.out.println("Enter numbers (space separated):");
        String input = sc.nextLine();

        String[] parts = input.split(" ");

        // Convert and print
        for (String num : parts) {
            int n = Integer.parseInt(num);

            if (n >= 0 && n <= 9) {
                System.out.print(words[n] + " ");
            } else {
                System.out.print("invalid ");
            }
        }
    }
}