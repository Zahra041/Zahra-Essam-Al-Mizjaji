import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int number[] = new int[5];
        inputAll(number);
    }
    public static void inputAll(int array[]){
        System.out.println("Enter the number:");
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            input.nextInt();
        }

    }

}
