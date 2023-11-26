import java.awt.print.Printable;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Enter the First number:");
        Scanner input= new Scanner(System.in);
        long firstNumber =input.nextLong();
        System.out.println("Enter the Second number:");
        long secondNumber =input.nextLong();
        multiple(firstNumber,secondNumber);
    }
    public static void multiple(long n ,long m){
        if (n>=m*m ) {
            System.out.println("true");
        }
        else{
            System.out.println("folse");
        }

    }
}
