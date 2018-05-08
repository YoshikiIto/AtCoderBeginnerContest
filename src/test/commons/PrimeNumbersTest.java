package commons;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumbersTest {

	@Test
	public void two_is_prime() {
		PrimeNumbers primenumbers = new PrimeNumbers();
		assertThat(primenumbers.isPrime(2), is(true));
	}

	@Test
	public void three_is_prime() {
		PrimeNumbers primenumbers = new PrimeNumbers();
		assertThat(primenumbers.isPrime(3), is(true));
	}

	@Test
	public void four_is_not_prime() {
		PrimeNumbers primenumbers = new PrimeNumbers();
		assertThat(primenumbers.isPrime(4), is(false));
	}

	@Test
	public void twentyseven_is_not_prime() {
		PrimeNumbers primenumbers = new PrimeNumbers();
		assertThat(primenumbers.isPrime(27), is(false));
	}

	@Test
	public void case_123521() {
		PrimeNumbers primenumbers = new PrimeNumbers();
		assertThat(primenumbers.isPrime(123521), is(false));
	}

	@Test
	public void sieve_to_120() {
		PrimeNumbers primenumbers = new PrimeNumbers();
		primenumbers.sieveOfEratosthenes(120);
	}

}
