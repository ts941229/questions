package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Level0 {
	
	// 각도기 문제
	public int protractor(int angle) {
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
	public int sum_of_even(int n) {
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			
			if(i%2==0) {
				answer+=i;
			}
		}
		
		return answer;
	}
	
	// 배열의 평균값
	public double avg_of_array(int[] numbers) {
        double answer = 0;
        
        double sum = 0;
        
        for(int i=0; i<numbers.length; i++) {
        	sum += numbers[i];
        	answer = sum/numbers.length;
        }
        
        return answer;
    }
	
	// 양꼬치
	public int lamb_skewer(int n, int k) {
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
	
	// 배열의 유사성
	public int similarity_of_array(String[] s1, String[] s2) {
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
	
	// 특정 글자 삭제
	public String remove_specific_letter(String my_string, String letter) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
        	
        	if(!Character.toString(my_string.charAt(i)).equals(letter)) {
        		answer = answer+Character.toString(my_string.charAt(i));
        	}
        }
        
        return answer;
    }
	
	// 옷값 할인 받기
	public int get_discount(int price) {
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
	
	// 배열 자르기
	public int[] cut_array(int[] numbers, int num1, int num2) {
			int length = (num2 - num1) + 1;
			
	        int[] answer = new int[length];
	        
	        for(int i=num1; i<=num2; i++) {
	        	answer[i-num1] = numbers[i];
	        }
	        
	        return answer;
	}
	
	// 피자 나누기3
	public int divide_pizza3(int slice, int n) {
        int answer = 0;
        float f = slice;
        
        answer = (int)Math.ceil(n/f);
        
        return answer;
    }
	
	// 배열 뒤집기
	public int[] turn_array_over(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = 0;
        for(int i=num_list.length-1; i>=0; i--) {
        	answer[j] = num_list[i];
        	j++;
        }
        return answer;
    }
	
	// 배열 요소의 길이
	public int[] length_of_element(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i=0; i<strlist.length; i++) {
        	answer[i] = strlist[i].length();
        }
        
        return answer;
    }
	
	// 피자 나누기1
	public int divide_pizza1(int n) {
        int answer = 0;
        float slice = 7F;
        
        answer = (int)Math.ceil(n/slice);
        return answer;
    }
	
	// 배열의 요소 2배 만들기
    public int[] make_array_double(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	answer[i] = (numbers[i]*2);
        }
        return answer;
    }
    
    // 삼각형의 완성조건1
    public int completion_condtion_of_triangle(int[] sides) {
        int answer = 0;
        
        int max = 0;
        int sum = 0;
        for(int i=0; i<sides.length; i++) {
        	sum += sides[i];
        	if(max<sides[i]) {
        		max = sides[i];
        	}
        }
        
        answer = max<(sum-max) ? 1 : 2;
        
        return answer;
    }
    
    // 편지
    public int letter(String message) {
        int answer = 0;
        
        answer = message.length() * 2;
        
        return answer;
    }
    
    // 문자열 뒤집기
    public String turn_string_over(String my_string) {
        String answer = "";
        char[] answer_array = new char[my_string.toCharArray().length];
        int idx = 0;
        for(int i=my_string.toCharArray().length-1; i>=0; i--) {
        	answer_array[idx] = my_string.toCharArray()[i];
        	idx++;
        }
        answer = String.valueOf(answer_array);
        return answer;
    }
	
    // 짝수와 홀수 갯수
    public int[] num_even_odd(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int i=0; i<num_list.length; i++) {
        	if(num_list[i]%2==0) {
        		even+=1;
        	}else {
        		odd+=1;
        	}
        }
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
    
    // 머쓱이보다 키큰사람
    public int taller_than_mussk(int[] array, int height) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++) {
        	if(array[i]>height) {
        		answer++;
        	}
        }
        
        return answer;
    }
    
    // 최댓값 만들기
    public int make_maximum(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        if(numbers.length>1) {
        	answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        }

        return answer;
    }
    
    // 점의 위치 구하기
    public int position_of_point(int[] dot) {
        int answer = 0;
        
        if(dot[0]>0 && dot[1]>0) {
        	answer = 1;
        }else if(dot[0]<0 && dot[1]>0) {
        	answer = 2;
        }else if(dot[0]<0 && dot[1]<0) {
        	answer = 3;
        }else if(dot[0]>0 && dot[1]<0) {
        	answer = 4;
        }
        
        return answer;
    }
    
    // 문자열안에 문자열
    public int string_in_string(String str1, String str2) {
        int answer = 0;
        
        if(str1.indexOf(str2)>=0) {
        	answer = 1;
        }else {
        	answer = 2;
        }
        
        return answer;
    }
    
    // 중복된 숫자 개수
    public int number_of_duplicate_numbers(int[] array, int n) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++) {
        	
        	if(array[i]==n) {
        		answer++;
        	}
        	
        }
        
        return answer;
    }
    
    // 모음제거
    public String remove_vowels(String my_string) {
        String answer = "";
        String[] vowels = {"a", "e", "i", "o", "u"};
        StringBuilder sb = new StringBuilder(my_string);
        ArrayList<Integer> idx_list = new ArrayList<Integer>();
        for(int i=0; i<my_string.length(); i++) {
        	for(int j=0; j<vowels.length; j++) {
        		if(vowels[j].equals(String.valueOf(my_string.charAt(i)))) {
        			idx_list.add(i);
        		}
        	}
        }
        
        idx_list.sort(Collections.reverseOrder());

        for(int i=0; i<idx_list.size(); i++) {
        	sb.deleteCharAt(idx_list.get(i));
        }
        
        answer = sb.toString();
        
        return answer;
    }
    
    // 순서쌍의 개수
    public int number_of_pairs(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
        	if(n%i==0) {
        		answer++;
        	}
        }
        
        return answer;
    }
    
    // 문자 반복 출력하기
    public String print_string_in_repetition(String my_string, int n) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++) {
        	for(int j=0; j<n; j++) {
        		answer = answer+my_string.charAt(i);
        	}
        }
        
        return answer;
    }
    
    // 아이스 아메리카노
    public int[] iced_americano(int money) {
        int[] answer = new int[2];
        int price = 5500;
        
        answer[0] = money/price;
        answer[1] = money%price;
        
        return answer;
    }
    
    // 자릿수 더하기
    public int sum_of_digits(int n) {
        int answer = 0;
        String container = "";
        container = n + "";
        for(int i=0; i<container.length(); i++) {
        	answer += Integer.parseInt(String.valueOf(container.charAt(i)));
        }
        return answer;
    }
    
    // 중앙값 구하기
    public int get_median(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        answer = array[(array.length/2)];
        
        return answer;
    }
    
    // 숨은 숫자들의 합
    public int sum_of_numbers_hidden(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++) {
        	 if(Character.isDigit(my_string.charAt(i))) {
        		 answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        	 }
        }
        return answer;
    }
    
    // 짝수는 싫어요
    public int[] hate_even(int n) {
    	int answer_size = 0;
    	if(n%2==0) {
    		answer_size = n/2;
    	}else {
    		answer_size = (n/2)+1;
    	}
    	int[] answer = new int[answer_size];
        int idx = 0;
        for(int i=1; i<=n; i++) {
        	if((i%2)!=0) {
        		answer[idx]=i;
        		idx++;
        	}
        }
        
        return answer;
    }
    
    // 제곱수 판별하기
    public int determine_perfect_square(int n) {
        int answer = 0;
        
        answer = 2;
        for(int i=1; i<=1000; i++) {
        	if((i*i)==n) {
        		answer = 1;
        	}
        }
        
        return answer;
    }
    
    // 세균증식
    public int bacterial_proliperation(int n, int t) {
        int answer = 0;
        answer = n;
        for(int i=1; i<=t; i++) {
        	answer = (answer*2);
        }
        
        return answer;
    }
    
    // n의 배수 고르기
    public int[] select_multiples_of_n(int n, int[] numlist) {
        ArrayList<Integer> answer_list = new ArrayList<Integer>();
        
        for(int i=0; i<numlist.length; i++) {
        	if(numlist[i]%n==0) {
        		answer_list.add(numlist[i]);
        	}
        }
        
        int[] answer = new int[answer_list.size()];
        for(int i=0; i<answer_list.size(); i++) {
        	answer[i] = answer_list.get(i);
        }
        
        return answer;
    }
    
    // 가위바위보 (2 0 5)
    public String rsp(String rsp) {
        String answer = "";
        
        for(int i=0; i<rsp.length(); i++) {
        	switch(String.valueOf(rsp.charAt(i))) {
	        	case "2" : answer+="0"; break;
	        	case "0" : answer+="5"; break;
	        	case "5" : answer+="2"; break;
        	}
        }
        
        return answer;
    }
    
    
    
    
}
