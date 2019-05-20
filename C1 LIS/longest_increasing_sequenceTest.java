import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class longest_increasing_sequenceTest {

    @Test
    public void LIS() {
        longest_increasing_sequence lis=new longest_increasing_sequence();
        int[] a = new int[] { 10, 22, 9, 33, 21, 50, 41, 60,80 };
        int length_a=lis.LIS(a);
        assertEquals(6,length_a);

        int[] b = new int[]  {5,9,3,11,17,14,21 };
        int length_b=lis.LIS(b);
        assertEquals(5,length_b);

        int[] c = new int[] { 3,9,7 };
        int length_c=lis.LIS(c);
        assertEquals(2,length_c);

        int[] d = new int[] { 27,29,5,3,14,18,100,64,2,89,61 };
        int length_d=lis.LIS(d);
        assertEquals(5,length_d);

    }
}
