package abc096;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProblemATest {

    @Test
    public void case1() {
        List<Integer> list = Arrays.asList(120, 100, 140);
        assertThat(ProblemA.calc(5, 5), is(5));
    }

    @Test
    public void case2() {
        List<Integer> list = Arrays.asList(120, 100, 140);
        assertThat(ProblemA.calc(2, 1), is(1));
    }

    @Test
    public void case3() {
        List<Integer> list = Arrays.asList(120, 100, 140);
        assertThat(ProblemA.calc(11, 30), is(11));
    }

}