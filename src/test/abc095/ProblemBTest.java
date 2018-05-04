package abc095;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProblemBTest {

    @Test
    public void case1() {
        List<Integer> list = Arrays.asList(120, 100, 140);
        assertThat(ProblemB.calcMax(3, 1000, 100,360), is(9));
    }

    @Test
    public void case2() {
        List<Integer> list = Arrays.asList(90, 90, 90, 90);
        assertThat(ProblemB.calcMax(4, 360, 90, 360), is(4));
    }

    @Test
    public void case3() {
        List<Integer> list = Arrays.asList(150, 130, 150, 130, 110);
        assertThat(ProblemB.calcMax(5, 3000, 110, 670), is(26));
    }

}