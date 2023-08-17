package programmers;

public class Level0 {
	public static void main(String[] args) {
		
		System.out.println(similarity_of_array(new String[] {"a", "b", "c"}, new String[] {"com", "b", "p", "c"}));
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
	
	// 배열의 평균값
	public static double avg_of_array(int[] numbers) {
        double answer = 0;
        
        double sum = 0;
        
        for(int i=0; i<numbers.length; i++) {
        	sum += numbers[i];
        	answer = sum/numbers.length;
        }
        
        return answer;
    }
	
	// 양꼬치
	public static int lamb_skewer(int n, int k) {
        int answer = 0;
        
        int n_price = n*12000;
        int k_price = k*2000;
        
        int discount = 0;
        
        if((n/10)>=1) {
        	discount = (n/10)*2000;
        }
        
        answer = (n_price + k_price) - discount;
        
        return answer;
    }
	
	public static int similarity_of_array(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i=0; i<s1.length; i++) {
        	for(int j=0; j<s2.length; j++) {
        		if(s1[i].equals(s2[j])) {
        			answer+=1;
        		}
        	}
        }
        return answer;
    }
	
}
