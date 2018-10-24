package s01_lotto;

import java.util.Arrays;
import java.util.Scanner;

public class 진성훈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inputlotto = new int[6];

		int[] lotto = new int[6];
		int random, result, input;

		int select;
		while (true) {
			System.out.println("로또 프로그램입니다. 원하시는 번호를 선택하세요. ");
			System.out.println("1.로또 번호 생성  | 2.모의 로또 게임   | 3.종료");

			select = sc.nextInt();

			switch (select) {

			case 1:// 로또 랜덤값 생성

				for (int i = 0; i < lotto.length; i++) {
					random = (int) (Math.random() * 45) + 1;
					lotto[i] = random;

					// 중복 값 제거
					for (int j = 0; j < i; j++) {
						if (lotto[i] == lotto[j]) {
							i--;
						}
					}
				}
				// 로또값 내림차순
				int tmp;
				for (int i = 0; i < lotto.length - 1; i++) {
					for (int j = i + 1; j < lotto.length; j++) {
						if (lotto[i] > lotto[j]) {
							tmp = lotto[i];
							lotto[i] = lotto[j];
							lotto[j] = tmp;
						}
					}
				}
				System.out.print("새로생성한 로또번호는>>  " + Arrays.toString(lotto) + " 입니다");

				break;

			case 2:

				// 새로운 로또 랜덤값생성
				for (int i = 0; i < lotto.length; i++) {
					random = (int) (Math.random() * 45) + 1;
					lotto[i] = random;

					// 중복 값 제거
					for (int j = 0; j < i; j++) {
						if (lotto[i] == lotto[j]) {
							i--;
						}
					}
				}

				// 입력값 받기
				int count = 1;

				Loop: for (int i = 0; i < inputlotto.length; i++) {
					System.out.printf("%d번째 번호를 입력하세요>>", i+1);
					input = sc.nextInt();

					if (input >= 1 && input <= 45) {
						inputlotto[i] = input;
						
							for (int j = 0; j < i; j++) {
								if (inputlotto[i] == inputlotto[j]) {
									System.out.println(inputlotto[j]);
									i--;
									continue Loop;
								}
							}
						
//						count++;
					} else {
						System.out.println("잘못 입력하셨습니다. 1~45까지의 숫자를 입력하세요");
						i--;
					}

				}

				System.out.println("입력하신 로또번호는   >>  " + Arrays.toString(inputlotto) + " 입니다");
				System.out.println("랜덤생성된 로또번호는>>  " + Arrays.toString(lotto) + " 입니다");

				int score = 0;

				for (int i = 0; i < inputlotto.length; i++) {
					for (int j = 0; j < lotto.length; j++) {
						if (inputlotto[i] == lotto[j]) {
							score++;
						}
					}

				}

				// 등수확인 switch
				switch (score) {

				case 6:
					System.out.println("모두 6개가 일치하여 1등입니다! 축하합니다!");
				case 5:
					System.out.println("모두 5개가 일치하여 2등입니다! 축하합니다!");
				case 4:
					System.out.println("모두 4개가 일치하여 3등입니다!");
				case 3:
					System.out.println("모두 3개가 일치하여 4등입니다!");
				case 2:
					System.out.println("모두 2개가 일치하여 5등입니다!");
				default:
					System.out.println("꽝입니다.....다음기회에..");

				}

				break;

			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			}

		}
	}
}
