package programmers;

public class Level0 {
	public static void main(String[] args) {
		System.out.println(sum_of_even(10));
	}
	
	// 각도기 문제
	public static int protractor(int angle) {
        int answer = 0;
        
        if(angle < 90 && angle > 0) {
        	answer = 1;
        }else if(angle == 90) {
        	answer = 2;
        }else if(angle > 90 && angle < 180) {
        	answer = 3;
        }else if(angle == 180) {
        	answer = 4;
        }
        
        return answer;
    }
	
	
	// 짝수의 합
	public static int sum_of_even(int n) {
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			
			if(i%2==0) {
				answer+=i;
			}
		}
		
		return answer;
	}
	
}
