package s01_lotto;

import java.util.Arrays;

public class 신영민 {
	// 다른 방법 : 6칸짜리 정수 배열 생성
	// 1~45 까지의 random수를 뽑아서 저장하는데 매번 그떄까지 저장된 값과 비교하여 중복된 값이 있으면 저장하지 않고 i값을 1빼서
	// 다시돌린다.
	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("금주의 로또 번호");
		
		System.out.println(Arrays.toString(lotto));
	}
}
