package s01_lotto;

import java.util.Scanner;

public class 류성곤 {

	public static void main(String[] args) {

		int tmp, time = 0;

		int[] lotto = new int[6];

		System.out.println("로또를 시작하시겠습니까?");

		System.out.println("============================");

		System.out.println("시작(1) or 종료(2)");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println("============================");

		if (num == 1) {

			for (int i = 0; i < lotto.length; i++) {

				lotto[i] = (int) (Math.random() * 45 + 1);

				for (int j = 0; j < i; j++) {

					if (lotto[i] == lotto[j]) {

						i--;

						time++;

						break;

					}

				}

			}

		} else if (num == 2) {

			System.out.println("프로그램 종료 합니다.");

			System.exit(0);

		} else {

			System.out.println("잘못 입력 되었습니다.");

			System.exit(0);

		}

		for (int i = 0; i < lotto.length; i++) {

			for (int j = i + 1; j < lotto.length; j++) {

				if (lotto[i] > lotto[j]) {

					tmp = lotto[i];

					lotto[i] = lotto[j];

					lotto[j] = tmp;

				}

			}

		}

		System.out.print(time + "번 중복\n");

		System.out.println("============================");

		System.out.print("당첨번호!!!!!!!\n");

		for (int i = 0; i < lotto.length; i++) {

			System.out.print(lotto[i] + "번");

		}
		sc.close();

		System.exit(0);

	}

}