package s01_lotto;

public class 최재훈_인터넷짱 {
	public static void main(String[] args) {
		int[] myLotto = new int[7];
		System.out.println("인생한방! 로또 번호생성기");

		for (int i = 0; i < myLotto.length; i++) {
			myLotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (myLotto[j] == myLotto[i]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < myLotto.length - 1; i++) {
			System.out.print(myLotto[i] + "  ");
		}
		System.out.println();
		System.out.println("대망의 마지막 보너스 번호!!!!");
		System.out.println("마지막 보너스 번호 :" + myLotto[6]);
	}
}
