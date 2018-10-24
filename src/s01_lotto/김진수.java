package s01_lotto;



//다른방법 :6칸짜리 정수배열 생성
	//1~45까지의 랜덤 수를 뽑아서 저장하는데 매번 그떄 까지 저장된 값과 비교하여 중복된 값이 있으면 저장하지 않고 i값을 1뺴서(i--) 다시 돌린다
public class 김진수 {
public static void main(String[] args) {

	int[] lotto= new int[6];
	//int n, tmp;  
	for(int i=0; i<lotto.length; i++ ) {
		lotto[i]= (int)(Math.random()*45)+1;
		//System.out.println(lotto[i]);
		
		for(int j=0; j<i; j++) {
			
			if(lotto[i]==lotto[j]) {
				i--;
				break;
				
			}
			
			
		}
		
		
		
		
		
		
	}for(int i=0; i<lotto.length; i++) {
		System.out.printf(lotto[i]+"\t");
		
	}
	
}
}
