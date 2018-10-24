package s01_lotto;

import java.util.Arrays;

public class 김성호_영민이_형꺼_베낌 {
	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					//다른 방법: 6칸짜리 정수 배열 생성
					//1~45까지의 random 수를 뽑아서 저장하는데 
					//매번 그때까지 저장된 값과 비교하여 중복된 값이 있으면  i값을 1빼서 다시 돌린다. 
				}
			}
		}
System.out.println("금주의 로또 번호");
		
		System.out.println(Arrays.toString(lotto));
	}
}
