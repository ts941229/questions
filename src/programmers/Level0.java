package programmers;

public class Level0 {
	public static void main(String[] args) {
		
		
		turn_array_over(new int[] {1,2,3,4,5});
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
	
	public static String remove_specific_letter(String my_string, String letter) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
        	
        	if(!Character.toString(my_string.charAt(i)).equals(letter)) {
        		answer = answer+Character.toString(my_string.charAt(i));
        	}
        }
        
        return answer;
    }
	
	public static int get_discount(int price) {
        int answer = 0;

        if (10 <= price && price < 100000){
            answer = (int)price;
        }else if (price >= 100000 && price < 300000){
            answer = (int)(price * 0.95f);
        }else if (price >= 300000 && price < 500000){
            answer = (int)(price * 0.9f);
        }else if (price >= 500000){
            answer = (int)(price * 0.8f);
        }
        return answer;
    }
	
	public static int[] cut_array(int[] numbers, int num1, int num2) {
			int length = (num2 - num1) + 1;
			
	        int[] answer = new int[length];
	        
	        for(int i=num1; i<=num2; i++) {
	        	answer[i-num1] = numbers[i];
	        }
	        
	        return answer;
	}
	
	public static int divide_pizza3(int slice, int n) {
        int answer = 0;
        float f = slice;
        
        answer = (int)Math.ceil(n/f);
        
        return answer;
    }
	
	
	public static int[] turn_array_over(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = 0;
        for(int i=num_list.length-1; i>=0; i--) {
        	answer[j] = num_list[i];
        	j++;
        }
        return answer;
    }
	
	
}
