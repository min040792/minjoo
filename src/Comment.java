/**
 * javadoc comment : 문서화할 때 사용
 * produced by BlueStream in 2018-10-02
 * MIT Copyright
 */

/*부분 주석(여러 줄 주석)
오늘 나는 자바를 배우기 시작했다.
이제 1주일이면 난 자바의 신이 된다.*/

//내일은 개천절이다. 개천절은 좋은 날이다.


//public: 클래스 활용 범위(프로젝트 내 모든 클래스의 접근 허용)
// class : 클래스 선언  
// Comment: 클래스 이름 => 첫 글자는 영어 대문자와 $ _ 만 허용. 주로 CamelCase로 쓴다.  
// {  } : 클래스 내용을 담는 그릇
public class Comment { 
	//main method: 모든 자바 프로그램의 시작점, 유일한 실행 메소드
	//static(정적): 클래스 생성 전에 미리 생성됨(메모리에 로드)
	//void: method가 명령을 수행하고 결과를 돌려주지 않는다.
	//main: method 이름. 소문자. main은 예약어라서 직접 만든 메소드에 쓸 수 없다.
	//String[] args : parameter(매개변수). method가 일을 하는데 필요한 데이터. 
	//여기선 문자 배열을 넘겨받는다
	public static void main (String[] args) {
		//System: 클래스 이름(API)
		// ~.- :~ 안에 들어 있는 -
		//out : System class 안의 field(PrintStream) 안의 println() 메소드를 실행
		//"wow, eclipse 편한데!!!": println() 메소드의 매개변수
		System.out.println("wow, eclipse 편한데!!!");
	}
}
