public class Q14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = -1;

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Don't try buffer overflow attacks in Java!");
        }
    }
}
