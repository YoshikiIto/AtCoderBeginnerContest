package commons;

import java.util.stream.IntStream;

public class PrimeNumbers {

	// 不必要な処理を行う
	public boolean isPrime_slow(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	// ルートxまで
	public boolean isPrime(int x) {
		for (int i = 2; i*i <= x; i++) {
			if (x % i == 0) {
				System.out.println(x + "is divisible by " + i);
				return false;
			}
		}
		return true;
	}

	// 指定したx以下の素数をリストアップする
	public IntStream sieveOfEratosthenes(int x) {
		return IntStream.rangeClosed(2, x)
				.filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
						.allMatch(j -> i%j !=0));
	}


}
