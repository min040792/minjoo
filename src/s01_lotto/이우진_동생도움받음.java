package s01_lotto;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

//다른 방법: 6칸짜리 정수 배열 생성
//1~45까지의 random 수를 뽑아서 저장하는데 
//매번 그때까지 저장된 값과 비교하여 중복된 값이 있으면 저장하지 않고 i값을 1빼서 다시 돌린다. 

public class 이우진_동생도움받음 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		int num; 
	
		for(int i=0; i<lotto.length; i++) {
			num = (int)(Math.random()*45+1);
		    lotto[i] = num; 
			
			for(int j=0; j<i ; j++) {  
			  
				if(lotto[j] == num) {  
				  i--;
			    }
			
			}
		  }
		 System.out.println(Arrays.toString(lotto)); 
	}
								
}
