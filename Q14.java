import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int result = sumOfSquares(n);
        System.out.println(result);
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
