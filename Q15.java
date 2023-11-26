import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        System.out.println("Enter the character:");
        Scanner input = new Scanner(System.in);
        String s =input.nextLine();
        int result = countVowels(s);
        System.out.println(result);
    }

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }
}
