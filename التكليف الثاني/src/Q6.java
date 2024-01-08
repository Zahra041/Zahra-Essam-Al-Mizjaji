//class FibonacciProgression extends Progression {
//    protected long prev;
//
//    public FibonacciProgression(long value1, long value2) {
//        long first = value1;
//        prev = value2 - value1;
//    }
//
//    public FibonacciProgression() {
//        this(0, 1);
//    }
//
//    protected void advance() {
//        long temp = prev;
//        prev = current;
//        current += temp;
//    }
//}
//    public static void main(String[] args) {
//        FibonacciProgression fp = new FibonacciProgression(2, 2);
//        Progression te =new Progression();
//        long val8 = 0;
//        for (int i = 0; i < 6; i++) {
//            val8 = fp.nextValue();
//        }
//
//
//        System.out.println("The eighth value of the Fibonacci progression is: " + val8);
//    }
//}
