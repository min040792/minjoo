package s01_lotto;
//다른 방법: 6칸짜리 정수 배열 생성
//1~45까지의 random 수를 뽑아서 저장하는데 
//매번 그때까지 저장된 값과 비교하여 중복된 값이 있으면 저장하지 않고 i값을 1빼서 다시 돌린다. 
public class 김민주 {
	public static void main(String[] args) {
		int money[] = new int[45];
		
		System.out.println("로또 사세요");
		
		for(int i=0; i<money.length; i++) {
			money[i] = (int)(Math.random()*45);
			for(int j=0; j<i; j++) {
				if(money[i] == money[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<6; i++) {
			System.out.print(money[i] + " ");
		}
	}
}