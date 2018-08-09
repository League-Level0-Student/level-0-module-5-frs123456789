package nested_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int a = 100; a > -1; a--) {
			System.out.println(a);
		}

		for (int b = 2; b < 101; b++) {
			if (b % 2 == 0) {
				System.out.println(b);
			}
		}
		for (int c = 1; c < 100; c++) {
			if (c % 2 == 1) {
				System.out.println(c);
			}
		}

		for (int d = 0; d < 501; d++) {

			if (d % 2 == 0) {
				System.out.println(d + " is even.");
			}
			if (d % 2 == 1) {
				System.out.println(d + " is odd");
			}

		}
		for (int e = 0; e < 178; e++) {
			if (e % 7 == 0) {
				System.out.println(e);
			}
		}

		for (int f = 2003; f < 2019; f++) {
			System.out.println("in " + f + " i was " + (f - 2003));
		}

		for (int x = 1; x < 8; x += 3) {
			for (int y = 0; y < 3; y++) {

				System.out.print(y + x);

			}
			System.out.println();
		}

		for (int q = 1; q < 99; q += 10) {
			for (int r = 0; r < 10; r++) {

				System.out.print(r + q +" ");

			}
			System.out.println();
		}

	}
}