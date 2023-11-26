import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte b = scanner.nextByte();
        System.out.println("Byte value entered is: " + b);

        System.out.print("Enter a short value: ");
        short s = scanner.nextShort();
        System.out.println("Short value entered is: " + s);

        System.out.print("Enter an int value: ");
        int i = scanner.nextInt();
        System.out.println("Int value entered is: " + i);

        System.out.print("Enter a long value: ");
        long l = scanner.nextLong();
        System.out.println("Long value entered is: " + l);

        System.out.print("Enter a float value: ");
        float f = scanner.nextFloat();
        System.out.println("Float value entered is: " + f);

        System.out.print("Enter a double value: ");
        double d = scanner.nextDouble();
        System.out.println("Double value entered is: " + d);

        System.out.print("Enter a boolean value: ");
        boolean bool = scanner.nextBoolean();
        System.out.println("Boolean value entered is: " + bool);

        scanner.close();
    }
}

