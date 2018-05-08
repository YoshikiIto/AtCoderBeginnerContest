package abc096;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProblemBTest {

	@Test
	public void case1() {
		assertThat(ProblemB.calc(5, 3, 11, 1), is(30));
	}

	@Test
	public void case2() {
		assertThat(ProblemB.calc(3, 3, 4, 2), is(22));
	}

	@Test
	public void case3() {
		assertThat(ProblemB.calc(1, 1, 1, 1), is(4));
	}

	@Test
	public void case4() {
		assertThat(ProblemB.calc(50, 50, 50, 10), is(51300));
	}

	@Test
	public void case5() {
		assertThat(ProblemB.calc(50, 50, 50, 1), is(200));
	}

	@Test
	public void case6() {
		assertThat(ProblemB.calc(1, 1, 1, 10), is(1026));
	}
}