
public class C3Q1 {

    /**
     * This is the source code for the addExact method in
     * the Math class. Complete the JML for this method.
     */
    public static int addExact(int x, int y) {
        int r = x + y;
        // HD 2-12 Overflow iff both arguments have the opposite sign of the result
        if (((x ^ r) & (y ^ r)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return r;
    }
}
