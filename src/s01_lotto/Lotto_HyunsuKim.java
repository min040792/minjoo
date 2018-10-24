package s01_lotto;

import java.util.Arrays;

public class Lotto_HyunsuKim {

	public static void main(String[] args) {

		int[] lottoNo = new int[6];
		
		for ( int i = 0; i < lottoNo.length; i++ ) {
			
			lottoNo[i] = (int)(Math.random()*45) + 1;
			
			// i = 0 일때는 j = 0으로 시작하기 때문에 진입 불가 
			for( int j = 0; j < i; j++ ) {
				if (lottoNo[i] == lottoNo[j]) {
					i--;
				}// if end
				
			}//for j end
			
		}// for i end
		
		System.out.println(Arrays.toString(lottoNo));
		
	} // main end

}
