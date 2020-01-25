package application;

public class Ex38 {

	public static void main(String[] args) {

		int k = 0;

		for (int i = 0; i <= 5; i++) {
			System.out.println("[1] +-- for i ----------------- i = " + i);

			for (int j = 0; j <= 6; j++) {
				System.out.println("[2] +-- for j ----------------- j = " + j);

				if ((i % 2 == 0) && (j % 2 == 0)) {
					k = k + 1;
					System.out.println("[3]  +-- (k = k + 1) ---------------- k = " + k);

				}

			}

		}

	}
}
