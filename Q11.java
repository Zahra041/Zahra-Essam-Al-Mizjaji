import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i=input.nextInt();
        boolean result = isEven(i);
        System.out.println(result);
    }

    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }
}


