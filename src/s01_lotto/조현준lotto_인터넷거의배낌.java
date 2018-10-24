package s01_lotto;

import java.util.Arrays;

public class 조현준lotto_인터넷거의배낌 {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=i+1;
		}
		System.out.println(Arrays.toString(lotto));
		
		int tmp, n;
		for(int i=0; i<6; i++) {
			n = (int)(Math.random()*45);
			tmp = lotto[i];
			lotto[i]=lotto[n];
			lotto[n]=tmp;
		}
		System.out.println(Arrays.toString(lotto));
		
		System.out.println("금주의 로또 번호");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]);
			if (i != 5) {
				System.out.print(" / ");
			}
			
		}
		
		//다른 방법: 6칸짜리 정수 배열 생성
		//1~45까지의 random 수를 뽑아서 저장하는데 
		//매번 그때까지 저장된 값과 비교하여 중복된 값이 있으면 저장하지 않고 i값을 1빼서 다시 돌린다. 
	}
}
