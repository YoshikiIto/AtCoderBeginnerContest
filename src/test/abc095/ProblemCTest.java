package abc095;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProblemCTest {

    @Test
    public void case1() {
        List<Integer> list = Arrays.asList(120, 100, 140);
        assertThat(ProblemC.calcMin(1500, 2000, 1600, 3, 2), is(7900));
    }

    @Test
    public void case2() {
        List<Integer> list = Arrays.asList(90, 90, 90, 90);
        assertThat(ProblemC.calcMin(1500, 2000, 1900, 3, 2), is(8500));
    }

    @Test
    public void case3() {
        List<Integer> list = Arrays.asList(150, 130, 150, 130, 110);
        assertThat(ProblemC.calcMin(1500, 2000, 500, 90000, 100000), is(100000000));
    }

}