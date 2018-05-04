package abc095;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProblemATest {

    @Test
    public void case1() {
        assertThat(ProblemA.calcAmount("oxo"), is("900"));
    }
    @Test
    public void case2() {
        assertThat(ProblemA.calcAmount("ooo"), is("1000"));
    }
    @Test
    public void case3() {
        assertThat(ProblemA.calcAmount("xxx"), is("700"));
    }
}