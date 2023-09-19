package codetree;

public class LevelTest {
	
	// a, b 두 자연수를 입력받아 a부터 b까지 3의 배수의 합을 구해 출력하는 프로그램을 작성해보세요.
	public void question1(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	
}
