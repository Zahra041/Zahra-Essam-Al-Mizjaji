import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = sumOfOdd(n);
        System.out.println(result);
    }

    public static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
